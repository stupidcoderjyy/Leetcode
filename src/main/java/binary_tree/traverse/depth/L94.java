package binary_tree.traverse.depth;

import binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L94 {
    public static class Recurse {
        final List<Integer> result = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            traverse(root);
            return result;
        }

        private void traverse(TreeNode node) {
            if (node == null) {
                return;
            }
            traverse(node.left);
            result.add(node.val);
            traverse(node.right);
        }
    }

    public static class Iteration {
        public List<Integer> inorderTraversal(TreeNode root) {
            if (root == null) {
                return List.of();
            }
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> nodes = new Stack<>();
            nodes.push(root);
            while (!nodes.isEmpty()) {
                TreeNode node = nodes.pop();
                if (node == null) {
                    result.add(nodes.pop().val);
                    continue;
                }

                if (node.right != null) {
                    nodes.push(node.right); //注册展开动作
                }
                nodes.push(node);
                nodes.push(null); //注册打印动作
                if (node.left != null) {
                    nodes.push(node.left);
                }
            }
            return result;
        }
    }
}
