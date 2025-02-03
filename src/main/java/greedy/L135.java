package greedy;

public class L135 {
    public int candy(int[] ratings) {
        if (ratings.length == 1) {
            return 1;
        }
        int[] candies = new int[ratings.length];
        candies[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            } else {
                candies[i] = 1;
            }
        }
        int sum = candies[ratings.length - 1];
        for (int i = ratings.length - 2 ; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
            sum += candies[i];
        }
        return sum;
    }
}
