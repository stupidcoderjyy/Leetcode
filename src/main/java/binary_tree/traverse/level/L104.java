package binary_tree.traverse.level;

import binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class L104 {
    public static int iteration(TreeNode root) {
        return new L104Iteration().maxDepth(root);
    }
    public static int recurse(TreeNode root) {
        return new L104Recurse().maxDepth(root);
    }
}

class L104Iteration {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> nodes = new ArrayDeque<>();
        int depth = 0;
        nodes.addFirst(root);
        while (!nodes.isEmpty()) {
            int len = nodes.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = nodes.removeFirst();
                if (node.left != null) {
                    nodes.addLast(node.left);
                }
                if (node.right != null) {
                    nodes.addLast(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}

class L104Recurse {
    int maxDepth;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        recurse(root, 1);
        return maxDepth;
    }

    private void recurse(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        maxDepth = Math.max(maxDepth, depth);
        recurse(node.left, depth + 1);
        recurse(node.right, depth + 1);
    }
}
