package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L763 {
    public List<Integer> partitionLabels(String s) {
        byte[] data = s.getBytes();
        int[] lastPos = new int[128];
        for (int i = 0; i < data.length; i++) {
            lastPos[data[i]] = i;
        }
        List<Integer> result = new ArrayList<>();
        int max = lastPos[data[0]];
        int start = 0;
        for (int i = 0; i < data.length; i++) {
            byte b = data[i];
            if (lastPos[b] > max) {
                max = lastPos[b];
            }
            if (i == max) {
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}
