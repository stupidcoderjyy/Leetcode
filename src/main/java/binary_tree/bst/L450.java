package binary_tree.bst;

import binary_tree.TreeNode;

public class L450 {
    TreeNode parent, target;

    //找到结点，用其右子树替代，左子树添加到右子树中（和L701思想差不多）
    public TreeNode deleteNode(TreeNode root, int key) {
        find(root, key);
        if (target == null) {
            return root;
        }
        insert(target.left, target.right);
        return replace(root);
    }

    private void find(TreeNode root, int key) {
        TreeNode node = root;
        while (node != null) {
            if (key < node.val) {
                parent = node;
                node = node.left;
            } else if (key > node.val) {
                parent = node;
                node = node.right;
            } else {
                break;
            }
        }
        target = node;
    }

    private TreeNode replace(TreeNode root) {
        TreeNode replaced = target.right == null ? target.left : target.right;
        if (parent == null) {
            return replaced;
        }
        if (parent.left == target) {
            parent.left = replaced;
        } else {
            parent.right = replaced;
        }
        return root;
    }

    private void insert(TreeNode from, TreeNode to) {
        if (to == null || from == null) {
            return;
        }
        while (to.left != null){
            to = to.left;
        }
        to.left = from;
    }
}
