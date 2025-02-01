package binary_tree;

public class L112 {
    int target;
    boolean exist;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        target = targetSum;
        recurse(root, 0);
        return exist;
    }

    private void recurse(TreeNode node, int sum) {
        if (exist) {
            return;
        }
        sum += node.val;
        if (node.left == null && node.right == null) {
            if (sum == target) {
                exist = true;
            }
            return;
        }
        if (node.left != null) {
            recurse(node.left, sum);
        }
        if (node.right != null) {
            recurse(node.right, sum);
        }
    }
}
