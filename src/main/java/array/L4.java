package array;

public class L4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        if ((l & 1) == 0) {
            return (findElement(nums1, nums2, l >> 1) + findElement(nums1, nums2, (l >> 1) + 1)) / 2.0;
        } else {
            return findElement(nums1, nums2, (l >> 1) + 1);
        }
    }

    public int findElement(int[] nums1, int[] nums2, int k) {
        int i1 = 0, i2 = 0;
        int l1 = nums1.length, l2 = nums2.length;
        while (true) {
            if (i1 == l1) {
                return nums2[i2 + k - 1];
            }
            if (i2 == l2) {
                return nums1[i1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[i1], nums2[i2]);
            }
            //删除[i1, j1], i1 = j1 + 1
            int half = k / 2;
            int j1 = Math.min(l1, i1 + half) - 1;
            int j2 = Math.min(l2, i2 + half) - 1;
            if (nums1[j1] < nums2[j2]) {
                k -= (j1 - i1 + 1);
                i1 = j1 + 1;
            } else {
                k -= (j2 - i2 + 1);
                i2 = j2 + 1;
            }
        }
    }
}
