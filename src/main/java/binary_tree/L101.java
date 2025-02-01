package binary_tree;

import java.util.Stack;

public class L101 {
    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root.left);
        nodes.push(root.right);
        while (!nodes.isEmpty()) {
            TreeNode node1 = nodes.pop();
            TreeNode node2 = nodes.pop();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            }
            nodes.push(node1.left);
            nodes.push(node2.right);
            nodes.push(node1.right);
            nodes.push(node2.left);
        }
        return true;
    }
}
