package binary_tree.traverse.level;

import binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L515 {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        Deque<TreeNode> nodes = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        nodes.addFirst(root);
        while (!nodes.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int len = nodes.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = nodes.removeFirst();
                max = Math.max(node.val, max);
                if (node.left != null) {
                    nodes.addLast(node.left);
                }
                if (node.right != null) {
                    nodes.addLast(node.right);
                }
            }
            result.add(max);
        }
        return result;
    }
}
