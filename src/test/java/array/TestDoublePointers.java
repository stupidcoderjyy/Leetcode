package array;

import array.double_pointers.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDoublePointers {

    @Test
    public void testL11() {
        Assertions.assertEquals(49, new L11().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    @Test
    public void testL844() {
        Assertions.assertFalse(new L844().backspaceCompare("a#c###", "ad#c"));
        Assertions.assertTrue(new L844().backspaceCompare("xywrrmp", "xywrrmu#p"));
        Assertions.assertTrue(new L844().backspaceCompare("c#d#", "ab##"));
        Assertions.assertTrue(new L844().backspaceCompare("ab#c", "ad#c"));
        Assertions.assertFalse(new L844().backspaceCompare("a#c", "b"));
    }

    @Test
    public void testL977() {
        Assertions.assertArrayEquals(new int[]{0,1,9,16,100}, new L977().sortedSquares(new int[]{-4,-1,0,3,10}));
        Assertions.assertArrayEquals(new int[]{4,9,9,49,121}, new L977().sortedSquares(new int[]{-7,-3,2,3,11}));
    }

    @Test
    public void testL209() {
        Assertions.assertEquals(0, new L209().minSubArrayLen(11, new int[]{1,1,1,1,1,1,1,1}));
        Assertions.assertEquals(2, new L209().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        Assertions.assertEquals(1, new L209().minSubArrayLen(4, new int[]{1,4,4}));
    }

    @Test
    public void testL904() {
        Assertions.assertEquals(5, new L904().totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
        Assertions.assertEquals(1, new L904().totalFruit(new int[]{0}));
        Assertions.assertEquals(5, new L904().totalFruit(new int[]{0,1,6,6,4,4,6}));
        Assertions.assertEquals(3, new L904().totalFruit(new int[]{1,2,1}));
        Assertions.assertEquals(3, new L904().totalFruit(new int[]{0,1,2,2}));
        Assertions.assertEquals(4, new L904().totalFruit(new int[]{1,2,3,2,2}));
    }

    @Test
    public void testL76() {
        Assertions.assertEquals("aa", new L76().minWindow("aa", "aa"));
        Assertions.assertEquals("abbbbbcdd", new L76().minWindow("aaaaaaaaaaaabbbbbcdd", "abcdd"));
        Assertions.assertEquals("", new L76().minWindow("a", "b"));
        Assertions.assertEquals("b", new L76().minWindow("ab", "b"));
        Assertions.assertEquals("BANC", new L76().minWindow("ADOBECODEBANC", "ABC"));
        Assertions.assertEquals("a", new L76().minWindow("a", "a"));
        Assertions.assertEquals("", new L76().minWindow("a", "aa"));
    }
}
