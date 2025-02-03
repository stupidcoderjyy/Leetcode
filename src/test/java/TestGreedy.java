import binary_tree.TreeNode;
import greedy.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestGreedy {
    @Test
    public void testL455() {
        Assertions.assertEquals(1, new L455().findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
        Assertions.assertEquals(2, new L455().findContentChildren(new int[]{1,2}, new int[]{1,2,3}));
        Assertions.assertEquals(0, new L455().findContentChildren(new int[]{1,2}, new int[]{}));
    }
    @Test
    public void testL376() {
        Assertions.assertEquals(2, new L376().wiggleMaxLength(new int[]{1,1,3,3}));
        Assertions.assertEquals(2, new L376().wiggleMaxLength(new int[]{3,3,2,2}));
        Assertions.assertEquals(3, new L376().wiggleMaxLength(new int[]{3,2,2,3}));
        Assertions.assertEquals(2, new L376().wiggleMaxLength(new int[]{3,2,2,1}));
        Assertions.assertEquals(2, new L376().wiggleMaxLength(new int[]{1,2,2,3}));
        Assertions.assertEquals(1, new L376().wiggleMaxLength(new int[]{1}));
        Assertions.assertEquals(1, new L376().wiggleMaxLength(new int[]{1,1}));
        Assertions.assertEquals(2, new L376().wiggleMaxLength(new int[]{1,2}));
    }

    @Test
    public void testL53() {
        assertL53(6, new int[]{-2,1,-3,4,-1,2,1,-5,4});
        assertL53(1, new int[]{1});
        assertL53(23, new int[]{5,4,-1,7,8});
    }

    private void assertL53(int expected, int[] nums) {
        Assertions.assertEquals(expected, new L53().maxSubArray(nums));
    }

    @Test
    public void testL122() {
        assertL122(2, new int[]{1,2,2,3});
        assertL122(1, new int[]{1,1,2});
        assertL122(1, new int[]{1,2});
        assertL122(1, new int[]{2,1,1,2});
        assertL122(0, new int[]{3,2,2,1});
        assertL122(0, new int[]{2,2,1});
        assertL122(1, new int[]{1,2,2,1});
        assertL122(0, new int[]{1});
        assertL122(0, new int[]{1,1,1});
        assertL122(10, new int[]{5,5,1,2,2,3,0,1,2,3,0,5,4,4});
    }

    private void assertL122(int expected, int[] nums) {
        Assertions.assertEquals(expected, new L122().maxProfit(nums));
    }

    @Test
    public void testL55() {
        assertL55(true, new int[]{2,3,1,1,4});
        assertL55(false, new int[]{3,2,1,0,4});
        assertL55(true, new int[]{0});
        assertL55(true, new int[]{1});
    }

    private void assertL55(boolean expected, int[] nums) {
        Assertions.assertEquals(expected, new L55().canJump(nums));
    }

    @Test
    public void testL45() {
        assertL45(2, new int[]{2,3,1,1,4});
        assertL45(2, new int[]{2,3,0,1,4});
        assertL45(3, new int[]{1,2,3,4,0,0,0,0});
        assertL45(0, new int[]{1});
    }

    private void assertL45(int expected, int[] nums) {
        Assertions.assertEquals(expected, new L45().jump(nums));
    }

    @Test
    public void testL1005() {
        assertL1005(6, new int[]{-3,-2,0,1}, 10);
        assertL1005(12, new int[]{-3,-2,3,4}, 10);
        assertL1005(8, new int[]{-3,-2,3,4}, 9);
        assertL1005(2, new int[]{-2,-1,-1}, 4);
        assertL1005(0, new int[]{-2,-1,-1}, 1);
        assertL1005(-1, new int[]{1}, 1);
    }

    private void assertL1005(int expected, int[] nums, int k) {
        Assertions.assertEquals(expected, new L1005().largestSumAfterKNegations(nums, k));
    }

    @Test
    public void testL134() {
        assertL134(0, new int[]{1,1,1,1,1}, new int[]{1,1,1,1,1});
        assertL134(-1, new int[]{1}, new int[]{2});
        assertL134(0, new int[]{1}, new int[]{1});
        assertL134(3, new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2});
        assertL134(3, new int[]{0,0,0,5,0}, new int[]{1,1,1,1,1});
        assertL134(-1, new int[]{2,3,4}, new int[]{3,4,3});
    }

    private void assertL134(int expected, int[] gas, int[] cost) {
        Assertions.assertEquals(expected, new L134().canCompleteCircuit(gas, cost));
    }

    @Test
    public void testL135() {
        assertL135(11, new int[]{1,3,4,5,2});    //1 2 3 4 1
        assertL135(6, new int[]{0,1,2});    //1 2 3
        assertL135(6, new int[]{0,1,1,2});  //1 2 1 2
        assertL135(7, new int[]{0,1,1,1,2});  //1 2 1 1 2
        assertL135(6, new int[]{2,1,0});  //3 2 1
        assertL135(6, new int[]{2,1,1,0});  //2 1 2 1
        assertL135(7, new int[]{2,1,1,1,0});  //2 1 1 2 1
        assertL135(5, new int[]{1,2,2,2});  //1,2,1,1
        assertL135(5, new int[]{1,1,1,2});  //1,1,1,2
        assertL135(5, new int[]{2,2,2,1});  //1,1,2,1
        assertL135(4, new int[]{1,1,1,1});  //1,1,1,1
        assertL135(4, new int[]{1,2,1});  //1,2,1
        assertL135(5, new int[]{2,1,2});  //2,1,2
        assertL135(1, new int[]{0});  //2 1 1 2 1
    }

    private void assertL135(int expected, int[] ratings) {
        Assertions.assertEquals(expected, new L135().candy(ratings));
    }

    @Test
    public void testL860() {
        assertL860(true, new int[]{5});
        assertL860(false, new int[]{10});
        assertL860(false, new int[]{20});
        assertL860(true, new int[]{5,5,5,10,20});
        assertL860(false, new int[]{5,5,10,10,20});
    }

    private void assertL860(boolean expected, int[] ratings) {
        Assertions.assertEquals(expected, new L860().lemonadeChange(ratings));
    }

    @Test
    public void testL406() {
        assertL406("[[3,0],[6,0],[7,0],[5,2],[3,4],[5,3],[6,2],[2,7],[9,0],[1,9]]", new int[][]{{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,0},{3,4},{6,2},{5,2}});
        assertL406("[[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]", new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}});
        assertL406("[[4,0],[5,0],[2,2],[3,2],[1,4],[6,0]]", new int[][]{{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}});
    }

    private void assertL406(String expected, int[][] people) {
        Assertions.assertEquals(expected, Arrays.deepToString(new L406().reconstructQueue(people)).replace(" ", ""));
    }

    @Test
    public void testL452() {
        assertL452(2, new int[][]{{10,16},{2,8},{1,6},{7,12}});
        assertL452(4, new int[][]{{1,2},{3,4},{5,6},{7,8}});
        assertL452(2, new int[][]{{1,2},{2,3},{3,4},{4,5}});
        assertL452(1, new int[][]{{1,2}});
        assertL452(1, new int[][]{{Integer.MIN_VALUE,Integer.MAX_VALUE}});
    }

    private void assertL452(int expected, int[][] arrows) {
        Assertions.assertEquals(expected, new L452().findMinArrowShots(arrows));
    }

    @Test
    public void testL435() {
        assertL435(0, new int[][]{{1,2}});
        assertL435(1, new int[][]{{1,3},{2,4}});
        assertL435(0, new int[][]{{1,3},{3,4}});
        assertL435(2, new int[][]{{1,3},{0,3},{2,3},{4,5}});
    }

    private void assertL435(int expected, int[][] arrows) {
        Assertions.assertEquals(expected, new L435().eraseOverlapIntervals(arrows));
    }

    @Test
    public void testL763() {
        assertL763("[1,1,1]", "abc");
        assertL763("[2,2,2]", "aabbcc");
        assertL763("[6,3]", "aabaabccc");
        assertL763("[9]", "aababcbcc");
    }

    private void assertL763(String expected, String s) {
        Assertions.assertEquals(expected, new L763().partitionLabels(s).toString().replace(" ", ""));
    }

    @Test
    public void testL56() {
        assertL56("[[1,10]]", new int[][]{{2,3},{4,5},{6,7},{8,9},{1,10}});
        assertL56("[[0,5]]", new int[][]{{1,4},{0,2},{3,5}});
        assertL56("[[0,3]]", new int[][]{{0,2},{2,3}});
        assertL56("[[0,4]]", new int[][]{{0,4},{2,4},{3,4}});
        assertL56("[[0,4]]", new int[][]{{0,4}});
    }

    private void assertL56(String expected, int[][] arrows) {
        Assertions.assertEquals(expected, Arrays.deepToString(new L56().merge(arrows)).replace(" ", ""));
    }

    @Test
    public void testL738() {
        assertL738(123, 123);
        assertL738(129, 132);
        assertL738(99, 102);
        assertL738(999999, 1012023);
        assertL738(9, 9);
    }

    private void assertL738(int expected, int n) {
        Assertions.assertEquals(expected, new L738().monotoneIncreasingDigits(n));
    }

    @Test
    public void testL968() {
        assertL968(1, new Integer[]{1});
        assertL968(1, new Integer[]{1,2});
        assertL968(1, new Integer[]{1,2,null,3,4});
        assertL968(2, new Integer[]{1,2,3,4,5});
        assertL968(2, new Integer[]{1,2,3,4,5,6});
        assertL968(2, new Integer[]{1,2,3,4,5,6,7});
        assertL968(3, new Integer[]{1,2,3,4,5,6,7,8});
        assertL968(2, new Integer[]{1,null,2,null,3,null,4});
        assertL968(2, new Integer[]{1,2,null,null,3,4,null,null,5,6});
        assertL968(4, new Integer[]{1,2,3,4,5,null,null,6,7,null,null,8,null,null,null,9,null,10});
        assertL968(2, new Integer[]{1,2,3,null,4,5,null,null,6});
    }

    private void assertL968(int expected, Integer[] root) {
        Assertions.assertEquals(expected, new L968().minCameraCover(TreeNode.build(root)));
    }
}
