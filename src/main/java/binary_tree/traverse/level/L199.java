package binary_tree.traverse.level;

import binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L199 {
    public List<Integer> rightSideView(TreeNode root) {
        final Deque<TreeNode> nodes = new ArrayDeque<>();
        final List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        nodes.addFirst(root);
        while (!nodes.isEmpty()) {
            int len = nodes.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = nodes.removeFirst();
                if (i == len - 1) {
                    result.add(node.val);
                }
                if (node.left != null) {
                    nodes.addLast(node.left);
                }
                if (node.right != null) {
                    nodes.addLast(node.right);
                }
            }
        }
        return result;
    }
}
