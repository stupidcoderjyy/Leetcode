package binary_tree;

public class L236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return recurse(root, p, q);
    }

    private TreeNode recurse(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return null;
        }
        if (node.val == p.val || node.val == q.val) {
            return node;
        }
        TreeNode n1 = recurse(node.left, p, q);
        TreeNode n2 = recurse(node.right, p, q);
        if (n1 != null && n2 != null) {
            return node;
        } else if (n1 != null) {
            return n1;
        } else {
            return n2;
        }
    }
}
