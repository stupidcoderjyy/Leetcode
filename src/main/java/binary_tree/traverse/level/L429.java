package binary_tree.traverse.level;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L429 {
    public static class Node {
        public int val;
        public List<Node> children;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        Deque<Node> nodes = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        nodes.addFirst(root);
        while (!nodes.isEmpty()) {
            int len = nodes.size();
            List<Integer> levelNodes = new ArrayList<>(len);
            for (int i = 0; i < len; i++) {
                Node node = nodes.removeFirst();
                levelNodes.add(node.val);
                node.children.forEach(nodes::addLast);
            }
            result.add(levelNodes);
        }
        return result;
    }
}
