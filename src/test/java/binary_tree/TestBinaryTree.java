package binary_tree;

import binary_tree.bst.L98;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBinaryTree {

    @Test
    public void testL101() {
        assertL101(true, 1,2,2,3,4,4,3);
        assertL101(false, 1,2,2,null,3,null,3);
    }

    private void assertL101(boolean expected, Integer ... nums) {
        TreeNode root = TreeNode.build(nums);
        Assertions.assertEquals(expected, new L101().isSymmetric(root));
    }

    @Test
    public void testL100() {
        assertL100(true, new Integer[]{1,2,3},new Integer[]{1,2,3});
        assertL100(false, new Integer[]{1},new Integer[]{2});
        assertL100(true, new Integer[]{},new Integer[]{});
        assertL100(false, new Integer[]{1},new Integer[]{});
        assertL100(false, new Integer[]{1,2,1},new Integer[]{1,1,2});
        assertL100(true, new Integer[]{1,null,3},new Integer[]{1,null,3});
    }

    private void assertL100(boolean expected, Integer[] nums1, Integer[] nums2) {
        Assertions.assertEquals(expected, L100.recurse(TreeNode.build(nums1), TreeNode.build(nums2)));
        Assertions.assertEquals(expected, L100.iteration(TreeNode.build(nums1), TreeNode.build(nums2)));
    }

    @Test
    public void testL572() {
        assertL572(true, new Integer[]{2,null,2,null,2,3},new Integer[]{2,null,2,3});
        assertL572(true, new Integer[]{3,4,5,1,2},new Integer[]{4,1,2});
        assertL572(true, new Integer[]{1,1},new Integer[]{1});
        assertL572(false, new Integer[]{3,4,5,1,2,null,null,null,null,0},new Integer[]{4,1,2});
    }

    private void assertL572(boolean expected, Integer[] root, Integer[] subRoot) {
        Assertions.assertEquals(expected, new L572().isSubtree(TreeNode.build(root), TreeNode.build(subRoot)));
    }

    @Test
    public void testL22() {
        assertL22(15, new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
        assertL22(6, new Integer[]{1,2,3,4,5,6});
        assertL22(7, new Integer[]{1,2,3,4,5,6,7});
        assertL22(8, new Integer[]{1,2,3,4,5,6,7,8});
        assertL22(1, new Integer[]{1});
        assertL22(0, new Integer[]{});
    }

    private void assertL22(int expected, Integer[] root) {
        Assertions.assertEquals(expected, L222.fast(TreeNode.build(root)));
        Assertions.assertEquals(expected, L222.traverse(TreeNode.build(root)));
    }

    @Test
    public void testL110() {
        assertL110(true, new Integer[]{1});
        assertL110(true, new Integer[]{1,1});
        assertL110(false, new Integer[]{1,1,null,1});
        assertL110(true, new Integer[]{3,9,20,null,null,15,7});
        assertL110(false, new Integer[]{1,2,2,3,3,null,null,4,4});
        assertL110(true, new Integer[]{});
    }

    private void assertL110(boolean expected, Integer[] root) {
        Assertions.assertEquals(expected, new L110().isBalanced(TreeNode.build(root)));
    }

    @Test
    public void testL257() {
        assertL257("[1->2->5,1->3]", new Integer[]{1,2,3,null,5});
        assertL257("[1]", new Integer[]{1});
        assertL257("[]", new Integer[]{});
    }

    private void assertL257(String expected, Integer[] root) {
        Assertions.assertEquals(expected, new L257().binaryTreePaths(TreeNode.build(root)).toString().replace(" ", ""));
    }

    @Test
    public void testL404() {
        assertL404(24, new Integer[]{3,9,20,null,null,15,7});
        assertL404(0, new Integer[]{1});
        assertL404(0, new Integer[]{});
    }

    private void assertL404(int expected, Integer[] root) {
        Assertions.assertEquals(expected, new L404().sumOfLeftLeaves(TreeNode.build(root)));
    }

    @Test
    public void testL513() {
        assertL513(1, new Integer[]{2,1,3});
        assertL513(7, new Integer[]{1,2,3,4,null,5,6,null,null,7});
        assertL513(1, new Integer[]{1});
    }

    private void assertL513(int expected, Integer[] root) {
        Assertions.assertEquals(expected, new L513().findBottomLeftValue(TreeNode.build(root)));
    }

    @Test
    public void testL112() {
        assertL112(true, 22, new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1});
        assertL112(false, 5, new Integer[]{1,2,3});
        assertL112(false, 0, new Integer[]{});
    }

    private void assertL112(boolean expected, int target, Integer[] root) {
        Assertions.assertEquals(expected, new L112().hasPathSum(TreeNode.build(root), target));
    }

    @Test
    public void testL113() {
        assertL113("[[5,4,11,2],[5,8,4,5]]", 22, new Integer[]{5,4,8,11,null,13,4,7,2,null,null,5,1});
        assertL113("[]", 5, new Integer[]{1,2,3});
        assertL113("[]", 0, new Integer[]{1,2});
        assertL113("[[1]]", 1, new Integer[]{1});
        assertL113("[]", 1, new Integer[]{});
    }

    private void assertL113(String expected, int target, Integer[] root) {
        Assertions.assertEquals(expected, new L113().pathSum(TreeNode.build(root), target).toString().replace(" ", ""));
    }

    @Test
    public void testL106() {
        new L106().buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3});
        new L106().buildTree(new int[]{-1}, new int[]{-1});
    }

    @Test
    public void testL105() {
        new L105().buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
        new L105().buildTree(new int[]{-1}, new int[]{-1});
    }

    @Test
    public void testL654() {
        new L654().constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
        new L654().constructMaximumBinaryTree(new int[]{3,2,1});
    }

    @Test
    public void testL617() {
        new L617().mergeTrees(TreeNode.build(new Integer[]{1,3,2,5}), TreeNode.build(new Integer[]{2,1,3,null,4,null,7}));
        new L617().mergeTrees(TreeNode.build(new Integer[]{1}), TreeNode.build(new Integer[]{1,2}));
    }

    @Test
    public void testL236() {
        assertL236(1, 2, 1, new Integer[]{1,2});
        assertL236(3, 5, 1, new Integer[]{3,5,1,6,2,0,8,null,null,7,4});
        assertL236(5, 5, 4, new Integer[]{3,5,1,6,2,0,8,null,null,7,4});
    }

    private void assertL236(int expected, int p, int q, Integer[] nums) {
        Assertions.assertEquals(expected, new L236().lowestCommonAncestor(TreeNode.build(nums), new TreeNode(p), new TreeNode(q)).val);
    }
}
