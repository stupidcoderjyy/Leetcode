package binary_tree.traverse.depth;

import binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L145 {
    public static class Recurse {
        final List<Integer> result = new ArrayList<>();

        public List<Integer> postorderTraversal(TreeNode root) {
            traverse(root);
            return result;
        }

        private void traverse(TreeNode node) {
            if (node == null) {
                return;
            }
            traverse(node.left);
            traverse(node.right);
            result.add(node.val);
        }
    }

    public static class Iteration {
        final List<Integer> result = new ArrayList<>();
        final Stack<TreeNode> nodes = new Stack<>();

        public List<Integer> postorderTraversal(TreeNode root) {
            if (root == null) {
                return result;
            }
            nodes.push(root);
            while (!nodes.isEmpty()) {
                TreeNode node = nodes.pop();
                if (node == null) {
                    result.add(nodes.pop().val);
                    continue;
                }
                nodes.push(node);
                nodes.push(null); //注册打印动作
                if (node.right != null) {
                    nodes.push(node.right); //注册展开动作
                }
                if (node.left != null) {
                    nodes.push(node.left);
                }
            }
            return result;
        }
    }
}
