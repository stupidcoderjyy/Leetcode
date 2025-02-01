package binary_tree.bst;

import binary_tree.TreeNode;

public class L108 {
    //递归：[l,r] → [l,m-1] & [m+1,r]，终止：l==r，行为：构造m结点，将[l,m-1]返回值设为左孩子，...
    public TreeNode sortedArrayToBST(int[] nums) {
        return recurse(nums, 0, nums.length - 1);
    }

    private TreeNode recurse(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int m = l + ((r - l) >> 1);
        TreeNode node = new TreeNode(nums[m]);
        node.left = recurse(nums, l, m - 1);
        node.right = recurse(nums, m + 1, r);
        return node;
    }
}
