package hash_table;

import java.util.*;

public class L49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            String key = getKey(s);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());
    }

    private String getKey(String s) {
        byte[] chs = s.getBytes();
        Arrays.sort(chs);
        return new String(chs);
    }
}
