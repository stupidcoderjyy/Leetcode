package array.double_pointers;

public class L11 {
    /*
        面积更大的情况只可能出现在舍弃短边之后，故移动短边指针
     */
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int result = 0;
        while (l != r) {
            if (height[l] < height[r]) {
                result = Math.max(result, height[l] * (r - l));
                l++;
            } else {
                result = Math.max(result, height[r] * (r - l));
                r--;
            }
        }
        return result;
    }
}
