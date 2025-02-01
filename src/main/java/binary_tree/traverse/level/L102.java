package binary_tree.traverse.level;

import binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        Deque<TreeNode> nodes = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        nodes.addFirst(root);
        while (!nodes.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            int len = nodes.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = nodes.removeFirst();
                levelNodes.add(node.val);
                if (node.left != null) {
                    nodes.addLast(node.left);
                }
                if (node.right != null) {
                    nodes.addLast(node.right);
                }
            }
            result.add(levelNodes);
        }
        return result;
    }
}
