package binary_tree;

public class L654 {
    int[] nums;

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        this.nums = nums;
        return build(0, nums.length - 1);
    }

    /*  l      m     r
        [     ]M[    ]
     */
    private TreeNode build(int l, int r) {
        if (l > r) {
            return null;
        }
        int i = l;
        int max = Integer.MIN_VALUE;
        int m = l;
        while (i <= r) {
            if (nums[i] > max) {
                max = nums[i];
                m = i;
            }
            i++;
        }
        TreeNode node = new TreeNode(max);
        node.left = build(l, m - 1);
        node.right = build(m + 1, r);
        return node;
    }
}
