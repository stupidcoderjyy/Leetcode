package binary_tree.bst;

import binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L501 {
    List<Integer> results = new ArrayList<>();
    int pre = Integer.MIN_VALUE;
    int count;
    int maxCount;

    public int[] findMode(TreeNode root) {
        count = 0;
        maxCount = -1;
        pre = root.val;
        traverse(root);
        int[] res = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
            res[i] = results.get(i);
        }
        return res;
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        traverse(node.left);
        if (node.val != pre) {
            count = 1;
            pre = node.val;
        } else {
            count++;
        }
        saveNumber();
        maxCount = Math.max(maxCount, count);
        traverse(node.right);
    }

    private void saveNumber() {
        if (count > maxCount) {
            results.clear();
            results.add(pre);
        } else if (count == maxCount) {
            results.add(pre);
        }
    }
}
