package binary_tree;

public class L222 {
    public static int fast(TreeNode root) {
        return new Fast().countNodes(root);
    }
    public static int traverse(TreeNode root) {
        return new Traverse().countNodes(root);
    }
}

class Fast {
    int maxDepth;

    //O(k^2)
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxDepth = getDepth(root);
        if (maxDepth == 1) {
            return 1;
        }
        return countBottomLevel(root) + (1 << (maxDepth - 1)) - 1;
    }

    private int getDepth(TreeNode node) {
        int depth = 0;
        while (node != null) {
            depth++;
            node = node.left;
        }
        return depth;
    }

    private int countBottomLevel(TreeNode root) {
        int l = 0, r = (1 << (maxDepth - 1)) - 1;
        while (l <= r) {
            int m = l + ((r - l) >> 1);
            TreeNode node = findNode(root, m);
            if (node != null) {
                l = m + 1;
            } else if (findNode(root, m - 1) == null) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return l;
    }

    private TreeNode findNode(TreeNode root, int i) {
        int d = maxDepth - 2;
        TreeNode node = root;
        while (d >= 0) {
            if (((i >> d) & 1) == 1) {
                node = node.right;
            } else {
                node = node.left;
            }
            d--;
        }
        return node;
    }
}

class Traverse {
    //O(2^k)
    public int countNodes(TreeNode root) {
        return count(root);
    }

    private int count(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + count(node.left) + count(node.right);
    }
}