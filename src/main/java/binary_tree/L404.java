package binary_tree;

public class L404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return count(root, false);
    }

    private int count(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        int num = isLeft && node.left == null && node.right == null ? node.val : 0;
        return num + count(node.left, true) + count(node.right, false);
    }
}
