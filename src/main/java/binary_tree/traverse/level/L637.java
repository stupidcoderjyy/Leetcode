package binary_tree.traverse.level;

import binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L637 {
    public List<Double> averageOfLevels(TreeNode root) {
        Deque<TreeNode> nodes = new ArrayDeque<>();
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        nodes.addFirst(root);
        while (!nodes.isEmpty()) {
            long sum = 0;
            int len = nodes.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = nodes.removeFirst();
                sum += node.val;
                if (node.left != null) {
                    nodes.addLast(node.left);
                }
                if (node.right != null) {
                    nodes.addLast(node.right);
                }
            }
            result.add((double)sum / len);
        }
        return result;
    }
}
