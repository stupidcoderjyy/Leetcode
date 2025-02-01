package binary_tree.bst;

import binary_tree.TreeNode;

public class L669 {
    /*
        1: 调整root
        2: 从新的root开始，从左右两侧向下，遇到不符合的结点后，删除结点和外侧子树，重复操作直到结束
     */
    public TreeNode trimBST(TreeNode root, int low, int high) {
        root = locateRoot(root, low, high);
        if (root == null) {
            return null;
        }
        removeChild(root, low, high);
        return root;
    }

    private TreeNode locateRoot(TreeNode root, int low, int high) {
        while (root != null) {
            if (root.val > high) {
                root = root.left;
            } else if (root.val < low) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }

    private void removeChild(TreeNode root, int low, int high) {
        TreeNode node = root;
        while (node.left != null) {
            if (node.left.val < low) {
                node.left = node.left.right;
                continue;
            }
            node = node.left;
        }
        node.left = null;
        node = root;
        while (node.right != null) {
            if (node.right.val > high) {
                node.right = node.right.left;
                continue;
            }
            node = node.right;
        }
        node.right = null;
    }
}
