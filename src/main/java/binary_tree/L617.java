package binary_tree;

public class L617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        merge(root1, root2);
        return root1;
    }
    
    private void merge(TreeNode node1, TreeNode node2) {
        node1.val += node2.val;
        if (node1.left != null && node2.left != null) {
            merge(node1.left, node2.left);
        } else if (node2.left != null) {
            node1.left = node2.left;
        }
        if (node1.right != null && node2.right != null) {
            merge(node1.right, node2.right);
        } else if (node2.right != null) {
            node1.right = node2.right;
        }
    }
}
