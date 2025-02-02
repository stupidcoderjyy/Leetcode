import backtrace.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestBackTrace {

    @Test
    public void testL77() {
        assertL77("[[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]", 4, 2);
        assertL77("[[1,2,3,4]]", 4, 4);
        assertL77("[[1]]", 1, 1);
    }

    private void assertL77(String expected, int n, int k) {
        Assertions.assertEquals(expected, new L77().combine(n, k).toString().replace(" ", ""));
    }

    @Test
    public void testL216() {
        assertL216("[[1,2,4]]", 3, 7);
        assertL216("[]", 4, 1);
        assertL216("[[1,2,6],[1,3,5],[2,3,4]]", 3, 9);
    }

    private void assertL216(String expected, int k, int n) {
        Assertions.assertEquals(expected, new L216().combinationSum3(k, n).toString().replace(" ", ""));
    }

    @Test
    public void testL17() {
        assertL17("[a,b,c]", "2");
        assertL17("[ad,ae,af,bd,be,bf,cd,ce,cf]", "23");
        assertL17("[]", "");
    }

    private void assertL17(String expected, String digits) {
        Assertions.assertEquals(expected, new L17().letterCombinations(digits).toString().replace(" ", ""));
    }

    @Test
    public void testL39() {
        assertL39("[]", new int[]{2}, 1);
        assertL39("[[2,2,3],[7]]", new int[]{2,3,6,7}, 7);
        assertL39("[[2,2,2,2],[2,3,3],[3,5]]", new int[]{2,3,5}, 8);
    }

    private void assertL39(String expected, int[] candidates, int target) {
        Assertions.assertEquals(expected, new L39().combinationSum(candidates, target).toString().replace(" ", ""));
    }

    @Test
    public void testL40() {
        assertL40("[[1,1,6],[1,2,5],[1,7],[2,6]]", new int[]{10,1,2,7,6,1,5}, 8);
        assertL40("[[1,2,2],[5]]", new int[]{2,5,2,1,2}, 5);
        assertL40("[]", new int[]{2}, 5);
    }

    private void assertL40(String expected, int[] candidates, int target) {
        Assertions.assertEquals(expected, new L40().combinationSum2(candidates, target).toString().replace(" ", ""));
    }

    @Test
    public void testL131() {
        assertL131("[[a,a,b],[aa,b]]", "aab");
        assertL131("[[a]]", "a");
    }

    private void assertL131(String expected, String s) {
        Assertions.assertEquals(expected, new L131().partition(s).toString().replace(" ", ""));
    }

    @Test
    public void testL93() {
        assertL93("[1.92.168.11,19.2.168.11,19.21.68.11,19.216.8.11,19.216.81.1,192.1.68.11,192.16.8.11,192.16.81.1,192.168.1.1]", "19216811");
        assertL93("[]", "25525511135255255255");
        assertL93("[]", "122");
        assertL93("[1.0.10.23,1.0.102.3,10.1.0.23,10.10.2.3,101.0.2.3]", "101023");
        assertL93("[0.0.0.0]", "0000");
        assertL93("[255.255.11.135,255.255.111.35]", "25525511135");
    }

    private void assertL93(String expected, String s) {
        Assertions.assertEquals(expected, new L93().restoreIpAddresses(s).toString().replace(" ", ""));
    }

    @Test
    public void testL78() {
        assertL78("[[],[1],[1,2],[1,2,3],[1,3],[2],[2,3],[3]]", new int[]{1,2,3});
        assertL78("[[],[0]]", new int[]{0});
        assertL78("[[]]", new int[]{});
    }

    private void assertL78(String expected, int[] nums) {
        Assertions.assertEquals(expected, new L78().subsets(nums).toString().replace(" ", ""));
    }

    @Test
    public void testL90() {
        assertL90("[[],[1],[1,2],[1,2,2],[2],[2,2]]", new int[]{1,2,2});
        assertL90("[[],[0]]", new int[]{0});
        assertL90("[[]]", new int[]{});
    }

    private void assertL90(String expected, int[] nums) {
        Assertions.assertEquals(expected, new L90().subsetsWithDup(nums).toString().replace(" ", ""));
    }

    @Test
    public void testL491() {
        assertL491("[[1,2],[0,0]]", new int[]{1,2,0,0});
        assertL491("[[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]", new int[]{4,6,7,7});
        assertL491("[[4,4]]", new int[]{4,4,3,2,1});
        assertL491("[]", new int[]{1});
        assertL491("[]", new int[]{1,0});
        assertL491("[[1,1]]", new int[]{1,1});
    }

    private void assertL491(String expected, int[] nums) {
        Assertions.assertEquals(expected, new L491().findSubsequences(nums).toString().replace(" ", ""));
    }

    @Test
    public void testL46() {
        assertL46("[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]", new int[]{1,2,3});
        assertL46("[[0,1],[1,0]]", new int[]{0,1});
        assertL46("[[1]]", new int[]{1});
    }

    private void assertL46(String expected, int[] nums) {
        Assertions.assertEquals(expected, new L46().permute(nums).toString().replace(" ", ""));
    }

    @Test
    public void testL47() {
        assertL47("[[1,1,2],[1,2,1],[2,1,1]]", new int[]{1,1,2});
        assertL47("[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]", new int[]{1,2,3});
        assertL47("[[0,1],[1,0]]", new int[]{0,1});
        assertL47("[[1]]", new int[]{1});
    }

    private void assertL47(String expected, int[] nums) {
        Assertions.assertEquals(expected, new L47().permuteUnique(nums).toString().replace(" ", ""));
    }

    @Test
    public void testL332() {
        assertL332("[JFK,ANU,EZE,AXA,TIA,ANU,JFK,TIA,ANU,TIA,JFK]", List.of(List.of("EZE","AXA"),
                List.of("TIA","ANU"),List.of("ANU","JFK"),List.of("JFK","ANU"),List.of("ANU","EZE"),
                List.of("TIA","ANU"),List.of("AXA","TIA"),List.of("TIA","JFK"),List.of("ANU","TIA"),List.of("JFK","TIA")));
        assertL332("[JFK,NRT,JFK,KUL]", List.of(List.of("JFK","KUL"),List.of("JFK","NRT"),List.of("NRT","JFK")));
        assertL332("[JFK,ATL,JFK,SFO,ATL,SFO]", List.of(List.of("JFK","SFO"),List.of("JFK","ATL"),List.of("SFO","ATL"),List.of("ATL","JFK"), List.of("ATL","SFO")));
        assertL332("[JFK,MUC,LHR,SFO,SJC]", List.of(List.of("MUC","LHR"),List.of("JFK","MUC"),List.of("SFO","SJC"),List.of("LHR","SFO")));
    }

    private void assertL332(String expected, List<List<String>> tickets) {
        Assertions.assertEquals(expected, new L332().findItinerary(tickets).toString().replace(" ", ""));
    }

    @Test
    public void testL51() {
        assertL51("[[.Q..,...Q,Q...,..Q.],[..Q.,Q...,...Q,.Q..]]", 4);
        assertL51("[[Q]]", 1);
    }

    private void assertL51(String expected, int n) {
        Assertions.assertEquals(expected, new L51().solveNQueens(n).toString().replace(" ", ""));
    }

    @Test
    public void testL37() {
        assertL37("[[5,3,4,6,7,8,9,1,2],[6,7,2,1,9,5,3,4,8],[1,9,8,3,4,2,5,6,7]," +
                            "[8,5,9,7,6,1,4,2,3],[4,2,6,8,5,3,7,9,1],[7,1,3,9,2,4,8,5,6]," +
                            "[9,6,1,5,3,7,2,8,4],[2,8,7,4,1,9,6,3,5],[3,4,5,2,8,6,1,7,9]]",
                new char[][]{
                        {'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}});
    }

    private void assertL37(String expected, char[][] board) {
        new L37().solveSudoku(board);
        StringBuilder sb = new StringBuilder("[");
        Arrays.stream(board).forEach(arr -> sb.append(Arrays.toString(arr)));
        Assertions.assertEquals(expected, sb.append("]").toString().replace(" ", "").replace("][", "],["));
    }
}
