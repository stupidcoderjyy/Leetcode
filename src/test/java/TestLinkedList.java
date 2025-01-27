import linked_list.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLinkedList {

    @Test
    public void testL203() {
        new L203().removeElements(buildLinkedList(new int[]{1,2,6,3,4,5,6}), 6);
        new L203().removeElements(buildLinkedList(new int[]{}), 1);
        new L203().removeElements(buildLinkedList(new int[]{7,7,7,7}), 7);
    }

    @Test
    public void testL707() {
        var list = new L707.MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        Assertions.assertEquals(2, list.get(1));
        list.deleteAtIndex(1);
        Assertions.assertEquals(3, list.get(1));
    }

    @Test
    public void testL206() {
        new L206().reverseList(buildLinkedList(new int[]{1,2,3,4,5}));
        new L206().reverseList(buildLinkedList(new int[]{1,2}));
        new L206().reverseList(buildLinkedList(new int[]{1}));
        new L206().reverseList(buildLinkedList(new int[]{}));
    }

    @Test
    public void testL24() {
        new L24().swapPairs(buildLinkedList(new int[]{1,2,3,4}));
        new L24().swapPairs(buildLinkedList(new int[]{1,2,3}));
        new L24().swapPairs(buildLinkedList(new int[]{1}));
        new L24().swapPairs(buildLinkedList(new int[]{}));
    }

    @Test
    public void testL19() {
        new L19().removeNthFromEnd(buildLinkedList(new int[]{1,2,3,4,5}), 2);
        new L19().removeNthFromEnd(buildLinkedList(new int[]{1,2,3,4,5}), 5);
        new L19().removeNthFromEnd(buildLinkedList(new int[]{1,2,3,4,5}), 1);
        new L19().removeNthFromEnd(buildLinkedList(new int[]{1}), 1);
    }

    private ListNode buildLinkedList(int[] nums) {
        final int N = nums.length;
        if (N == 0) {
            return new ListNode();
        }
        var root = new ListNode(nums[N - 1]);
        int i = N - 2;
        while (i >= 0) {
            root = new ListNode(nums[i--], root);
        }
        return root;
    }
}
