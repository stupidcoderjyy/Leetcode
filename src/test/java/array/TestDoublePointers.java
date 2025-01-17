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
}
