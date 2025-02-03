package greedy;

public class L860 {
    int[] money = new int[3];

    public boolean lemonadeChange(int[] bills) {
        for (int b : bills) {
            if (!change(b)) {
                return false;
            }
        }
        return true;
    }

    private boolean change(int m) {
        switch (m) {
            case 5 -> money[0]++;
            case 10 -> money[1]++;
            case 15 -> money[2]++;
        }
        m -= 5;
        while (m >= 20 && money[2] > 0) {
            money[2]--;
            m -= 20;
        }
        while (m >= 10 && money[1] > 0) {
            money[1]--;
            m -= 10;
        }
        while (m >= 5 && money[0] > 0) {
            money[0]--;
            m -= 5;
        }
        return m == 0;
    }
}
