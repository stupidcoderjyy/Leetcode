package binary_tree;

import binary_tree.bst.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestBst {

    @Test
    public void testL98() {
        assertL98(false, new Integer[]{-2147483648,-2147483648});
        assertL98(true, new Integer[]{5,3,8,1,4,6,9});
        assertL98(false, new Integer[]{5,14,null,1});
        assertL98(false, new Integer[]{32,26,47,19,null,null,56,null,27});
        assertL98(false, new Integer[]{1,1});
        assertL98(false, new Integer[]{5,4,6,null,null,3,7});
        assertL98(false, new Integer[]{5,3,8,1,4,6,4});
        assertL98(true, new Integer[]{2,1,3});
    }

    private void assertL98(boolean expected, Integer[] root) {
        Assertions.assertEquals(expected, L98.range(TreeNode.build(root)));
        Assertions.assertEquals(expected, L98.traverse(TreeNode.build(root)));
    }

    @Test
    public void testL530() {
        assertL530(47, new Integer[]{543,384,652,null,445,null,699});
        assertL530(1, new Integer[]{1,0,48,null,null,12,49});
    }

    private void assertL530(int expected, Integer[] root) {
        Assertions.assertEquals(expected, new L530().getMinimumDifference(TreeNode.build(root)));
    }

    @Test
    public void testL501() {
        assertL501("[1,2]", new Integer[]{1,null,2});
        assertL501("[2]", new Integer[]{1,null,2,2});
        assertL501("[0]", new Integer[]{0});
    }

    private void assertL501(String expected, Integer[] root) {
        Assertions.assertEquals(expected, Arrays.toString(new L501().findMode(TreeNode.build(root))).replace(" ", ""));
    }

    @Test
    public void testL701() {
        new L701().insertIntoBST(TreeNode.build(new Integer[]{4,2,7,1,3}), 5);
        new L701().insertIntoBST(TreeNode.build(new Integer[]{}), 5);
    }

    @Test
    public void testL450() {
        //一般情况
        assertL450("9 7 11 6 8 3 1 4", new Integer[]{9,5,11,3,7,null,null,1,4,6,8}, 5);
        //根结点
        assertL450("11 5 3 7 1 4 6 8", new Integer[]{9,5,11,3,7,null,null,1,4,6,8}, 9);
        //叶节点
        assertL450("9 5 11 3 7 4 6 8", new Integer[]{9,5,11,3,7,null,null,1,4,6,8}, 1);
        //左节点为空
        assertL450("9 7 11 6 8", new Integer[]{9,5,11,null,7,null,null,6,8}, 5);
        //右节点为空
        assertL450("9 3 11 1 4", new Integer[]{9,5,11,3,null,null,null,1,4}, 5);
        //不存在
        assertL450("9 5 11 7 6 8", new Integer[]{9,5,11,null,7,null,null,6,8}, 20);
        //空
        assertL450("", new Integer[]{}, 20);
    }

    private void assertL450(String expected, Integer[] root, int target) {
        Assertions.assertEquals(
                expected,
                TreeNode.debugString(new L450().deleteNode(TreeNode.build(root), target)));
    }

    @Test
    public void testL669() {
        //一般情况
        assertL669("9 7 11 6 8", new Integer[]{9,5,11,3,7,null,null,1,4,6,8}, 6, 11);
        assertL669("5 3 7 4 6", new Integer[]{9,5,11,3,7,null,null,1,4,6,8}, 3, 7);
        //不存在
        assertL669("", new Integer[]{9,5,11,3,7,null,null,1,4,6,8}, -2, -1);
        assertL669("", new Integer[]{9}, -2, -1);
        //区间相等
        assertL669("6", new Integer[]{9,5,11,3,7,null,null,1,4,6,8}, 6, 6);
        assertL669("9", new Integer[]{9,5,11,3,7,null,null,1,4,6,8}, 9, 9);
        assertL669("9", new Integer[]{9}, 9, 9);
    }

    private void assertL669(String expected, Integer[] root, int low, int high) {
        Assertions.assertEquals(
                expected,
                TreeNode.debugString(new L669().trimBST(TreeNode.build(root), low, high)));
    }

    @Test
    public void testL108() {
        assertL108("1", new int[]{1});
        assertL108("1 2", new int[]{1,2});
        assertL108("2 1 3", new int[]{1,2,3});
        assertL108("2 1 3 4", new int[]{1,2,3,4});
        assertL108("3 1 4 2 5", new int[]{1,2,3,4,5});
        assertL108("3 1 5 2 4 6", new int[]{1,2,3,4,5,6});
    }

    private void assertL108(String expected, int[] nums) {
        Assertions.assertEquals(
                expected,
                TreeNode.debugString(new L108().sortedArrayToBST(nums)));
    }

    @Test
    public void testL538() {
        assertL538("30 36 21 36 35 26 15 33 8", new Integer[]{4,1,6,0,2,5,7,null,null,null,3,null,null,null,8});
        assertL538("", new Integer[]{});
        assertL538("1 1", new Integer[]{0,null,1});
        assertL538("3 3 2", new Integer[]{1,0,2});
        assertL538("7 9 4 10", new Integer[]{3,2,4,1});
    }

    private void assertL538(String expected, Integer[] nums) {
        Assertions.assertEquals(
                expected,
                TreeNode.debugString(new L538().convertBST(TreeNode.build(nums))));
    }
}
