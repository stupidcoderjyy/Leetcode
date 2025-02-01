package binary_tree.traverse.depth;

import binary_tree.TreeNode;

import java.util.*;

public class L144 {
    public static class Recurse {
        final List<Integer> result = new ArrayList<>();

        public List<Integer> preorderTraversal(TreeNode root) {
            traverse(root);
            return result;
        }

        private void traverse(TreeNode node) {
            if (node == null) {
                return;
            }
            result.add(node.val);
            traverse(node.left);
            traverse(node.right);
        }
    }

    public static class Iteration {
        final List<Integer> result = new ArrayList<>();
        final Stack<TreeNode> nodes = new Stack<>();

        public List<Integer> preorderTraversal(TreeNode root) {
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
                if (node.right != null) {
                    nodes.push(node.right); //注册展开动作
                }
                if (node.left != null) {
                    nodes.push(node.left);
                }
                nodes.push(node);
                nodes.push(null); //注册打印动作
            }
            return result;
        }
    }
}
