package binary_tree.traverse;

import binary_tree.TreeNode;
import binary_tree.traverse.depth.L144;
import binary_tree.traverse.depth.L145;
import binary_tree.traverse.depth.L94;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDepthTraverse {

    @Test
    public void testL144() {
        assertL144("[1,2,3]", 1, null, 2, 3);
        assertL144("[1,2,4,5,6,7,3,8,9]", 1,2,3,4,5,null,8,null,null,6,7,9);
    }

    private void assertL144(String expected, Integer ... nums) {
        TreeNode root = TreeNode.build(nums);
        Assertions.assertEquals(expected, new L144.Recurse().preorderTraversal(root).toString().replace(" ", ""));
        Assertions.assertEquals(expected, new L144.Iteration().preorderTraversal(root).toString().replace(" ", ""));
    }

    @Test
    public void testL145() {
        assertL145("[3,2,1]", 1, null, 2, 3);
        assertL145("[4,6,7,5,2,9,8,3,1]", 1,2,3,4,5,null,8,null,null,6,7,9);
    }

    private void assertL145(String expected, Integer ... nums) {
        TreeNode root = TreeNode.build(nums);
        Assertions.assertEquals(expected, new L145.Recurse().postorderTraversal(root).toString().replace(" ", ""));
        Assertions.assertEquals(expected, new L145.Iteration().postorderTraversal(root).toString().replace(" ", ""));
    }

    @Test
    public void testL94() {
        assertL94("[1,3,2]", 1, null, 2, 3);
        assertL94("[4,2,6,5,7,1,3,9,8]", 1,2,3,4,5,null,8,null,null,6,7,9);
    }

    private void assertL94(String expected, Integer ... nums) {
        TreeNode root = TreeNode.build(nums);
        Assertions.assertEquals(expected, new L94.Recurse().inorderTraversal(root).toString().replace(" ", ""));
        Assertions.assertEquals(expected, new L94.Iteration().inorderTraversal(root).toString().replace(" ", ""));
    }
}
