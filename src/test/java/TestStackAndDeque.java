import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stack_and_deque.*;

public class TestStackAndDeque {

    @Test
    public void test225() {
        L225.MyStack stack = new L225.MyStack();
        stack.push(1);
        stack.push(2);
        Assertions.assertEquals(2, stack.top());
        stack.push(3);
        Assertions.assertEquals(3, stack.top());

        stack = new L225.MyStack();
        stack.push(1);
        stack.push(2);
        Assertions.assertEquals(2, stack.top());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.pop());
        stack.push(3);
        stack.push(4);
        Assertions.assertEquals(4, stack.top());
    }

    @Test
    public void testL20() {
        Assertions.assertTrue(new L20().isValid("()"));
        Assertions.assertTrue(new L20().isValid("()[]{}"));
        Assertions.assertFalse(new L20().isValid("(]"));
        Assertions.assertTrue(new L20().isValid("([])"));
        Assertions.assertFalse(new L20().isValid("((([]()("));
        Assertions.assertFalse(new L20().isValid("))"));
        Assertions.assertTrue(new L20().isValid("[[[[][]]]]"));
    }

    @Test
    public void testL1047() {
        Assertions.assertEquals("ca", new L1047().removeDuplicates("abbaca"));
        Assertions.assertEquals("a", new L1047().removeDuplicates("aaa"));
        Assertions.assertEquals("", new L1047().removeDuplicates("aaaa"));
        Assertions.assertEquals("", new L1047().removeDuplicates("abcddcba"));
    }

    @Test
    public void testL150() {
        Assertions.assertEquals(9, new L150().evalRPN(new String[]{"2","1","+","3","*"}));
        Assertions.assertEquals(6, new L150().evalRPN(new String[]{"4","13","5","/","+"}));
        Assertions.assertEquals(22, new L150().evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    @Test
    public void testL239() {
        Assertions.assertArrayEquals(new int[]{5,5}, new L239().maxSlidingWindow(new int[]{4,5,-2}, 2));
        Assertions.assertArrayEquals(new int[]{5,5}, new L239().maxSlidingWindow(new int[]{5,5,5,5}, 3));
        Assertions.assertArrayEquals(new int[]{10,9,8,7}, new L239().maxSlidingWindow(new int[]{10,9,8,7,6,5}, 3));
        Assertions.assertArrayEquals(new int[]{3,3,5,5,6,7}, new L239().maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
        Assertions.assertArrayEquals(new int[]{1}, new L239().maxSlidingWindow(new int[]{1}, 1));
    }

    @Test
    public void testL347() {
        Assertions.assertArrayEquals(new int[]{1,2}, new L347().topKFrequent(new int[]{1,1,1,2,2,3},2));
        Assertions.assertArrayEquals(new int[]{1}, new L347().topKFrequent(new int[]{1},1));
    }
}
