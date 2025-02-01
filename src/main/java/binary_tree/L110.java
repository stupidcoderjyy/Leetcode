package binary_tree;

public class L110 {
    private int maxDeltaHeight;

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        height(root);
        return maxDeltaHeight <= 1;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int h1 = height(node.left);
        int h2 = height(node.right);
        maxDeltaHeight = Math.max(Math.abs(h1 - h2), maxDeltaHeight);
        return Math.max(h1, h2) + 1;
    }
}
