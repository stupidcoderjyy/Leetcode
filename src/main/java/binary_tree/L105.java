package binary_tree;

public class L105 {
    int[] inorder;
    int[] preOrder;
    int[] numToPosInOrder = new int[6001];

    /*
        inOrder:    [  L  ]M[    R    ]
        preOrder:   M[  L  ][    R    ]
        从root结点（M）开始，不断切分直至区间内只剩1或0个结点
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.inorder = inorder;
        this.preOrder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            numToPosInOrder[3000 + inorder[i]] = i;
        }
        return recurse(0, inorder.length - 1, 0, preorder.length - 1);
    }

    /*              il      i          ir
        inOrder:    [   L  ]M[    R    ]
                        pl+1                 pr
        preOrder:      M[  i-il  ][  ir - i  ]
     */
    private TreeNode recurse(int il, int ir, int pl, int pr) {
        if (il > ir) {
            return null;
        }
        int num = preOrder[pl];
        TreeNode node = new TreeNode(num);
        int i = numToPosInOrder[3000 + num];
        int pl1 = pl + 1;
        int pr1 = pl1 + (i - il) - 1;
        int pl2 = pr1 + 1;
        node.left = recurse(il, i - 1, pl1, pr1);
        node.right = recurse(i + 1, ir, pl2, pr);
        return node;
    }
}
