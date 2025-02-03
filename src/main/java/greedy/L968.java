package greedy;

import binary_tree.TreeNode;

public class L968 {
    int count = 0;
    public static final int OUTSIDE = 0;
    public static final int INSIDE = 2;
    public static final int HAS_CAMERA = 3;

    public int minCameraCover(TreeNode root) {
        if (recurse(root) == OUTSIDE) {
            count++;
        }
        return count;
    }

    private int recurse(TreeNode node) {
        if (node == null) {
            return INSIDE;
        }
        int l = recurse(node.left);
        int r = recurse(node.right);
        if (l == INSIDE && r == INSIDE) {
            return OUTSIDE;
        }
        if (l == OUTSIDE || r == OUTSIDE) {
            count++;
            return HAS_CAMERA;
        }
        //必有一个是摄像头
        return INSIDE;
    }
}
