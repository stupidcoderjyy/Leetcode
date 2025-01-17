package array;

import array.binary_search.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBinarySearch {

    @Test
    public void testL34() {
        Assertions.assertEquals(1, new L34().findFirst(new int[]{1,2,2,2}, 2));
        Assertions.assertEquals(3, new L34().findLast(new int[]{1,2,2,2}, 2));
        Assertions.assertEquals(-1, new L34().findFirst(new int[]{1,2,2,2}, 0));
        Assertions.assertEquals(-1, new L34().findLast(new int[]{1,2,2,2}, 0));
        Assertions.assertEquals(-1, new L34().findFirst(new int[]{1,2,2,2}, 3));
        Assertions.assertEquals(-1, new L34().findLast(new int[]{1,2,2,2}, 3));

        Assertions.assertArrayEquals(new int[]{3,4}, new L34().searchRange(new int[]{5,7,7,8,8,10}, 8));
        Assertions.assertArrayEquals(new int[]{-1,-1}, new L34().searchRange(new int[]{5,7,7,8,8,10}, 6));
        Assertions.assertArrayEquals(new int[]{-1,-1}, new L34().searchRange(new int[0], 6));
    }

    @Test
    public void testL35() {
        Assertions.assertEquals(1, new L35().searchInsert(new int[]{1,3}, 2));
        Assertions.assertEquals(2, new L35().searchInsert(new int[]{1,3,5,6}, 5));
        Assertions.assertEquals(1, new L35().searchInsert(new int[]{1,3,5,6}, 2));
        Assertions.assertEquals(4, new L35().searchInsert(new int[]{1,3,5,6}, 7));
        Assertions.assertEquals(0, new L35().searchInsert(new int[]{1,3,5,6}, 0));
    }

    @Test
    public void testL69() {
        Assertions.assertEquals(4, new L69().mySqrt(24));
        Assertions.assertEquals(5, new L69().mySqrt(25));
        Assertions.assertEquals(5, new L69().mySqrt(26));
        Assertions.assertEquals(0, new L69().mySqrt(1));
    }

    @Test
    public void testL367() {
        Assertions.assertFalse(new L367().isPerfectSquare(24));
        Assertions.assertTrue(new L367().isPerfectSquare(25));
        Assertions.assertFalse(new L367().isPerfectSquare(26));
        Assertions.assertTrue(new L367().isPerfectSquare(1));
    }

    @Test
    public void testL704() {
        Assertions.assertEquals(0, new L704().search1(new int[]{5}, 5));
        Assertions.assertEquals(4, new L704().search1(new int[]{-1,0,3,5,9,12}, 9));
        Assertions.assertEquals(-1, new L704().search1(new int[]{-1,0,3,5,9,12}, 2));

        Assertions.assertEquals(0, new L704().search2(new int[]{5}, 5));
        Assertions.assertEquals(4, new L704().search2(new int[]{-1,0,3,5,9,12}, 9));
        Assertions.assertEquals(-1, new L704().search2(new int[]{-1,0,3,5,9,12}, 2));
    }
}
