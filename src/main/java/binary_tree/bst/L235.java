package binary_tree.bst;

import binary_tree.TreeNode;

public class L235 {
    int p;
    int q;
    TreeNode result;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.p = Math.min(p.val, q.val);
        this.q = Math.max(p.val, q.val);
        recurse(root);
        return result;
    }

    //从上到下遍历，遇到的第一个（最高的）位于区间内的结点就是最近公共祖先
    private void recurse(TreeNode node) {
        if (node == null || result != null) {
            return;
        }
        if (node.val >= p && node.val <= q) {
            result = node;
            return;
        }
        recurse(node.left);
        recurse(node.right);
    }
}
