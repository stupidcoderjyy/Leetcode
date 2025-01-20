package array.double_pointers;

public class L904 {
    public int totalFruit(int[] fruits) {
        //[l, r)
        int[] fruitToCount = new int[fruits.length];
        int l = 0, r = 0;
        int types = 0;
        int count = 0;
        L1:
        while (true) {
            while (true) {
                if (r == fruits.length) {
                    count = Math.max(count, r - l);
                    break L1;
                }
                if (fruitToCount[fruits[r]]++ == 0 && ++types > 2) {
                    break;
                }
                r++;
            }
            count = Math.max(count, r - l);
            while (true) {
                if (--fruitToCount[fruits[l++]] == 0) {
                    if (--types == 2) {
                        break;
                    }
                }
            }
            r++;
        }
        return count;
    }

    public int totalFruit0(int[] fruits) {
        //[l, r)
        int l = 0, r = 0;
        int sum = 0;
        int t1, t2 = -1;
        while (true) {
            t1 = fruits[l];
            while (r < fruits.length) {
                int f = fruits[r];
                if (f != t1) {
                    if (t2 < 0) {
                        t2 = f;
                    } else if (f != t2) {
                        break;
                    }
                }
                r++;
            }
            sum = Math.max(sum, r - l);
            if (r == fruits.length) {
                return sum;
            }
            t2 = fruits[r];
            l = r - 1;
            while (fruits[--l] == fruits[r - 1]);
            l++;
        }
    }
}
