package binary_tree.traverse;

import binary_tree.TreeNode;

import java.util.*;

public class L226 {
    public static class Level {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            Deque<TreeNode> nodes = new ArrayDeque<>();
            nodes.addFirst(root);
            while (!nodes.isEmpty()) {
                int len = nodes.size();
                for (int i = 0; i < len; i++) {
                    TreeNode node = nodes.removeFirst();
                    swap(node);
                    if (node.left != null) {
                        nodes.addLast(node.left);
                    }
                    if (node.right != null) {
                        nodes.addLast(node.right);
                    }
                }
            }
            return root;
        }
    }

    public static class Depth {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> nodes = new Stack<>();
            nodes.push(root);
            while (!nodes.isEmpty()) {
                TreeNode node = nodes.pop();
                if (node == null) {
                    swap(nodes.pop());
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
            return root;
        }
    }

    public static void swap(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
