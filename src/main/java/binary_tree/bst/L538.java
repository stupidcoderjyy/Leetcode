package binary_tree.bst;

import binary_tree.TreeNode;

public class L538 {
    int sum;

    //反转的中序遍历
    public TreeNode convertBST(TreeNode root) {
        recurse(root);
        return root;
    }

    private void recurse(TreeNode node) {
        if (node == null) {
            return;
        }
        recurse(node.right);
        sum += node.val;
        node.val = sum;
        recurse(node.left);
    }
}
