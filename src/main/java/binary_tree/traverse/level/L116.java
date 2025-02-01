package binary_tree.traverse.level;

import binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L116 {
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }


    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Deque<Node> nodes = new ArrayDeque<>();
        nodes.addFirst(root);
        while (!nodes.isEmpty()) {
            Node lastNode = null;
            int len = nodes.size();
            for (int i = 0; i < len; i++) {
                Node node = nodes.removeFirst();
                if (lastNode != null) {
                    lastNode.next = node;
                }
                lastNode = node;
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
