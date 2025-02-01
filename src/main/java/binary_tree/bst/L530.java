package binary_tree.bst;

import binary_tree.TreeNode;

public class L530 {
    int prev = -1;
    int minDelta = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        return minDelta;
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        traverse(node.left);
        if (prev >= 0) {
            minDelta = Math.min(node.val - prev, minDelta);
        }
        prev = node.val;
        traverse(node.right);
    }
}
