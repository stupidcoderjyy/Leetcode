package array;

import array.elements_remove.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestElementsRemove {

    @Test
    public void testL27() {
        assertL27(new int[]{5}, new int[]{4,5}, 4);
        assertL27(new int[]{2,2}, new int[]{3,2,2,3}, 3);
        assertL27(new int[]{0,1,3,0,4}, new int[]{0,1,2,2,3,0,4,2}, 2);
    }

    private void assertL27(int[] ans, int[] nums, int val) {
        int k = new L27().removeElement(nums, val);
        Assertions.assertEquals(k, ans.length);
        for (int i = 0 ; i < k ; i ++) {
            Assertions.assertEquals(nums[i], ans[i]);
        }
    }

    @Test
    public void testL26() {
        assertL26(new int[]{1,2}, new int[]{1,1,2});
        assertL26(new int[]{0,1,2,3,4}, new int[]{0,0,1,1,1,2,2,3,3,4});
    }

    private void assertL26(int[] ans, int[] nums) {
        int k = new L26().removeDuplicates(nums);
        Assertions.assertEquals(k, ans.length);
        for (int i = 0 ; i < k ; i ++) {
            Assertions.assertEquals(nums[i], ans[i]);
        }
    }

    @Test
    public void testL283() {
        assertL283(new int[]{1,3,12,0,0}, new int[]{0,1,0,3,12});
        assertL283(new int[]{0}, new int[]{0});
    }

    private void assertL283(int[] ans, int[] nums) {
        new L283().moveZeroes(nums);
        Assertions.assertArrayEquals(ans, nums);
    }
}
