import array.L1;
import hash_table.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestHashTable {

    @Test
    public void testL242() {
        Assertions.assertTrue(new L242().isAnagram("anagram","nagaram"));
        Assertions.assertFalse(new L242().isAnagram("rat","car"));
    }

    @Test
    public void testL49() {
        Assertions.assertEquals(
                "[[eat, tea, ate], [tan, nat], [bat]]",
                new L49().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).toString());
        Assertions.assertEquals("[[]]", new L49().groupAnagrams(new String[]{""}).toString());
        Assertions.assertEquals("[[a]]", new L49().groupAnagrams(new String[]{"a"}).toString());
        Assertions.assertEquals("[[, ]]", new L49().groupAnagrams(new String[]{"",""}).toString());
    }

    @Test
    public void testL438() {
        Assertions.assertEquals(List.of(0,6), new L438().findAnagrams("cbaebabacd", "abc"));
        Assertions.assertEquals(List.of(0,1,2,3,4,5,6,7,8), new L438().findAnagrams("123412341234", "1234"));
    }

    @Test
    public void testL383() {
        Assertions.assertFalse(new L383().canConstruct("a", "b"));
        Assertions.assertFalse(new L383().canConstruct("aa", "ab"));
        Assertions.assertTrue(new L383().canConstruct("aa", "aab"));
    }

    @Test
    public void testL202() {
        Assertions.assertTrue(new L202().isHappy(19));
        Assertions.assertFalse(new L202().isHappy(2));
        Assertions.assertFalse(new L202().isHappy(Integer.MAX_VALUE));
    }

    @Test
    public void testL454() {
        Assertions.assertEquals(2, new L454().fourSumCount(new int[]{1,2}, new int[]{-2,-1}, new int[]{-1,2}, new int[]{0,2}));
    }
}
