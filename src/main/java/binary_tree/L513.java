package binary_tree;

public class L513 {
    int result;
    int maxDepth;

    public int findBottomLeftValue(TreeNode root) {
        recurse(root, 1);
        return result;
    }

    private void recurse(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        if (depth > maxDepth) {
            maxDepth = depth;
            result = node.val;
        }
        recurse(node.left, depth + 1);
        recurse(node.right, depth + 1);
    }
}
