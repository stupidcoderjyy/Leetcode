package greedy;

public class L134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int N = gas.length;
        int sum = 0;
        int total = 0;
        int start = 0;
        for (int i = 0; i < N; i++) {
            int d = gas[i] - cost[i];
            sum += d;
            total += d;
            if (sum < 0) {
                //开头只可能在i后面
                sum = 0;
                start = (i + 1) % N;
            }
        }
        return total < 0 ? -1 : start;
    }
}
