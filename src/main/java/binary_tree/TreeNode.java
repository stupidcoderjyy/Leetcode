package binary_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "{" + val + "}";
    }

    public static String debugString(TreeNode root) {
        if (root == null) {
            return "";
        }
        Deque<TreeNode> nodes = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        nodes.addFirst(root);
        while (!nodes.isEmpty()) {
            int len = nodes.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = nodes.removeFirst();
                result.add(node.val);
                if (node.left != null) {
                    nodes.addLast(node.left);
                }
                if (node.right != null) {
                    nodes.addLast(node.right);
                }
            }
        }
        String s = result.toString();
        s = s.substring(1, s.length() - 1);
        return s.replace(",", "");
    }

    public static TreeNode build(Integer[] nums) {
        if (nums.length == 0) {
            return null;
        }
        Deque<TreeNode> nodes = new ArrayDeque<>();
        TreeNode root = new TreeNode(nums[0]);
        nodes.addLast(root);
        int i = 1;
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.removeFirst();
            if (i == nums.length) {
                break;
            }
            if (nums[i] != null) {
                TreeNode child = new TreeNode(nums[i]);
                node.left = child;
                nodes.addLast(child);
            }
            if (++i == nums.length) {
                break;
            }
            if (nums[i] != null) {
                TreeNode child = new TreeNode(nums[i]);
                node.right = child;
                nodes.addLast(child);
            }
            if (++i == nums.length) {
                break;
            }
        }
        return root;
    }
}