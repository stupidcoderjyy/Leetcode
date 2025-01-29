package hash_table;

public class L242 {
    public boolean isAnagram(String s, String t) {
        int[] alphaToCount = new int[128];
        int count = 0;
        for (byte b : s.getBytes()) {
            if (alphaToCount[b]++ == 0) {
                count++;
            }
        }
        for (byte b : t.getBytes()) {
            if (alphaToCount[b] == 0) {
                return false;
            }
            if (--alphaToCount[b] == 0) {
                count--;
            }
        }
        return count == 0;
    }
}
