package hash_table;

public class L383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] sup = new int[128];
        for (byte b : magazine.getBytes()) {
            sup[b]++;
        }
        int[] req = new int[128];
        for (byte b : ransomNote.getBytes()) {
            if (req[b]++ == sup[b]) {
                return false;
            }
        }
        return true;
    }
}
