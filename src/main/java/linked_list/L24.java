package linked_list;

public class L24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode n0 = null, n1 = head, newHead = head.next;
        while (n1 != null && n1.next != null) {
            final var n2 = n1.next;
            final var n3 = n2.next;
            n1.next = n2.next;
            n2.next = n1;
            if (n0 != null) {
                n0.next = n2;
            }
            n0 = n1;
            n1 = n3;
        }
        return newHead;
    }
}
