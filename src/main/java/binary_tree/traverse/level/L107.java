package binary_tree.traverse.level;

import binary_tree.TreeNode;

import java.util.List;

public class L107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        return reverse(new L102().levelOrder(root));
    }

    private <T> List<T> reverse(List<T> list) {
        int l = 0, r = list.size() - 1;
        while (l < r) {
            var temp = list.get(l);
            list.set(l, list.get(r));
            list.set(r, temp);
            l++;
            r--;
        }
        return list;
    }
}
