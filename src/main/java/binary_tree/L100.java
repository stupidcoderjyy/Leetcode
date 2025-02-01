package binary_tree;

import java.util.Stack;

public class L100 {
    public static boolean iteration(TreeNode p, TreeNode q) {
        return new Iteration().isSameTree(p, q);
    }
    public static boolean recurse(TreeNode p, TreeNode q) {
        return new Recurse().isSameTree(p, q);
    }
}

class Iteration {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(p);
        nodes.push(q);
        while (!nodes.isEmpty()) {
            TreeNode n1 = nodes.pop();
            TreeNode n2 = nodes.pop();
            if (n1 == null && n2 == null) {
                continue;
            }
            if (n1 == null || n2 == null || n1.val != n2.val) {
                return false;
            }
            nodes.push(n1.left);
            nodes.push(n2.left);
            nodes.push(n1.right);
            nodes.push(n2.right);
        }
        return true;
    }
}

class Recurse {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //终止
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        //递归检查
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}