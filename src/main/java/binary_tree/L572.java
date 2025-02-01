package binary_tree;

public class L572 {
    TreeNode subRoot;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        this.subRoot = subRoot;
        return checkNode(root);
    }

    private boolean checkNode(TreeNode node) {
        if (isEquals(node, subRoot)) {
            return true;
        }
        if (node == null) {
            return false;
        }
        return checkNode(node.left) || checkNode(node.right);
    }

    private boolean isEquals(TreeNode p, TreeNode q) {
        return L100.recurse(p, q);
    }
}
