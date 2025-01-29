import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import string.*;

public class TestString {

    @Test
    public void testL541() {
        Assertions.assertEquals("bacdfeg", new L541().reverseStr("abcdefg", 2));
        Assertions.assertEquals("bacd", new L541().reverseStr("abcd", 2));
    }

    @Test
    public void testKC54() {
        Assertions.assertEquals("anumber", KC54.replace("a1"));
        Assertions.assertEquals("numbera", KC54.replace("1a"));
        Assertions.assertEquals("anumberbnumbercnumber", KC54.replace("a1b2c3"));
    }

    @Test
    public void testL151() {
        Assertions.assertEquals("blue is sky the", new L151().reverseWords("the sky is blue"));
        Assertions.assertEquals("a b c", new L151().reverseWords("c b a"));
        Assertions.assertEquals("a", new L151().reverseWords("  a  "));
    }

    @Test
    public void testKC55() {
        Assertions.assertEquals("fgabcde", KC55.rotate("abcdefg", 2));
        Assertions.assertEquals("fabcde", KC55.rotate("abcdef", 1));
        Assertions.assertEquals("fabcde", KC55.rotate("fabcde", 6));
    }

    @Test
    public void testL28Next() {
        Assertions.assertArrayEquals(new int[]{0,0,0,1,0,1,2,3}, new L28().buildNext("12131212".getBytes()));
        Assertions.assertArrayEquals(new int[]{0,0,0,0}, new L28().buildNext("1234".getBytes()));
        Assertions.assertArrayEquals(new int[]{0}, new L28().buildNext("1".getBytes()));
        Assertions.assertArrayEquals(new int[]{0,0,1,2,3,4}, new L28().buildNext("111111".getBytes()));
    }

    @Test
    public void testL28() {
        Assertions.assertEquals(0, new L28().strStr("sadbutsad", "sad"));
        Assertions.assertEquals(2, new L28().strStr("aaaabb", "aabb"));
        Assertions.assertEquals(-1, new L28().strStr("aabc", "aabb"));
        Assertions.assertEquals(-1, new L28().strStr("aac", "aabb"));
        Assertions.assertEquals(4, new L28().strStr("121312131212", "12131212"));
    }

    @Test
    public void testL459() {
        Assertions.assertFalse(new L459().repeatedSubstringPattern("12131212"));
        Assertions.assertTrue(new L459().repeatedSubstringPattern("12131213"));
        Assertions.assertFalse(new L459().repeatedSubstringPattern("1234"));
        Assertions.assertFalse(new L459().repeatedSubstringPattern("1"));
        Assertions.assertTrue(new L459().repeatedSubstringPattern("111111"));
        Assertions.assertFalse(new L459().repeatedSubstringPattern("aba"));
        Assertions.assertTrue(new L459().repeatedSubstringPattern("abcabcabcabc"));
        Assertions.assertFalse(new L459().repeatedSubstringPattern("a"));
    }
}
