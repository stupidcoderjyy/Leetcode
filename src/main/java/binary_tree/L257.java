package binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L257 {
    List<String> result = new ArrayList<>();
    Stack<Integer> path = new Stack<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        recurse(root);
        return result;
    }

    private void recurse(TreeNode node) {
        path.add(node.val);
        if (node.left == null && node.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size() - 1; i++) {
                sb.append(path.get(i)).append("->");
            }
            sb.append(path.get(path.size() - 1));
            result.add(sb.toString());
            return;
        }
        if (node.left != null) {
            recurse(node.left);
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            recurse(node.right);
            path.remove(path.size() - 1);
        }
    }
}