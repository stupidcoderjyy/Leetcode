package binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L113 {
    int targetSum;
    List<List<Integer>> result = new ArrayList<>();
    Stack<Integer> path = new Stack<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return List.of();
        }
        this.targetSum = targetSum;
        recurse(root, 0);
        return result;
    }

    private void recurse(TreeNode node, int sum) {
        sum += node.val;
        path.add(node.val);
        if (node.left == null && node.right == null) {
            if (sum == targetSum) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        if (node.left != null) {
            recurse(node.left, sum);
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            recurse(node.right, sum);
            path.remove(path.size() - 1);
        }
    }
}
