package binary_tree.bst;

import binary_tree.TreeNode;

public class L98 {
    public static boolean range(TreeNode root) {
        return new L98Range().isValidBST(root);
    }

    public static boolean traverse(TreeNode root) {
        return new L98Traverse().isValidBST(root);
    }
}

class L98Range {
    public boolean isValidBST(TreeNode root) {
        return recurseCheck(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean recurseCheck(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.val < min || node.val > max) {
            return false;
        }
        return recurseCheck(node.left, min, (long)node.val - 1) && recurseCheck(node.right, (long)node.val + 1, max);
    }
}

class L98Traverse {
    long prev = Long.MIN_VALUE;

    //二叉搜索数的中序遍历是有序的
    public boolean isValidBST(TreeNode root) {
        return recurse(root);
    }

    private boolean recurse(TreeNode node) {
        if (node == null) {
            return true;
        }
        boolean b = recurse(node.left);
        if (!b || node.val <= prev) {
            return false;
        }
        prev = node.val;
        return recurse(node.right);
    }
}