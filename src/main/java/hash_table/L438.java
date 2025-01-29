package hash_table;

import java.util.ArrayList;
import java.util.List;

public class L438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] supposed = new int[128];
        int um = 0;
        for (byte b : p.getBytes()) {
            if (supposed[b]++ == 0) {
                um++;
            }
        }
        byte[] data = s.getBytes();
        int i = 0, j = 0;
        int[] actual = new int[128];
        L1:
        while (i < data.length) {
            if (supposed[data[i]] == 0) {
                i++;
                continue;
            }
            if (i > j) {
                j = i;
            }
            //j:下一轮检查位 → 右移j直到结束/匹配成功/匹配失败
            while (true) {
                if (j == data.length) {
                    break L1;   //结束
                }
                byte b2 = data[j];
                if (actual[b2] == supposed[b2]) {
                    break;  //匹配失败
                }
                j++;
                if (++actual[b2] == supposed[b2]) {
                    um--;
                }
                if (um == 0) {
                    result.add(i);
                    break;  //匹配成功
                }
            }
            //[i,j)已匹配 → 下一轮起始位i+1
            if (actual[data[i]]-- == supposed[data[i]]) {
                um++;
            }
            i++;
        }
        return result;
    }
}
