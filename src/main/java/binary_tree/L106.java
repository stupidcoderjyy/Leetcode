package binary_tree;

public class L106 {
    int[] inorder;
    int[] postorder;
    int[] numToPosInOrder = new int[6001];

    /*
        inOrder:    [  L  ]M[    R    ]
        postOrder:  [  L  ][    R    ]M
        从root结点（M）开始，不断切分直至区间内只剩1或0个结点
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        for (int i = 0; i < inorder.length; i++) {
            numToPosInOrder[3000 + inorder[i]] = i;
        }
        return recurse(0, inorder.length - 1, 0, postorder.length - 1);
    }

    /*              il      i          ir
        inOrder:    [   L  ]M[    R    ]
                        pl                  pr-1
        postOrder:      [  i-il  ][  ir - i  ]M
     */
    private TreeNode recurse(int il, int ir, int pl, int pr) {
        if (il > ir) {
            return null;
        }
        int num = postorder[pr];
        TreeNode node = new TreeNode(num);
        int i = numToPosInOrder[3000 + num];
        int pr1 = pl + (i - il) - 1;
        int pl2 = pr1 + 1;
        int pr2 = pr - 1;
        node.left = recurse(il, i - 1, pl, pr1);
        node.right = recurse(i + 1, ir, pl2, pr2);
        return node;
    }
}
