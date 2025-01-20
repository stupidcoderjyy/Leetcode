package array.elements_remove;

public class L26 {
    public int removeDuplicates(int[] nums) {
        int f = 0, s = 0;
        L1:
        while (true) {
            if (f == nums.length) {
                break;
            }
            int t = nums[f++];
            nums[s++] = t;
            while (true) {
                if (f == nums.length) {
                    break L1;
                }
                if (nums[f] != t) {
                    break;
                }
                f++;
            }
        }
        return s;
    }
}
