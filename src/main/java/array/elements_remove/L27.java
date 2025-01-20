package array.elements_remove;

public class L27 {
    public int removeElement(int[] nums, int val) {
        int s = 0, f = 0;
        L1:
        while (f != nums.length) {
            while (true) {
                if (f == nums.length) {
                    break L1;
                }
                if (nums[f] != val) {
                    break;
                }
                f++;
            }
            nums[s++] = nums[f++];
        }
        return s;
    }
}
