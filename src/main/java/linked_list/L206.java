package linked_list;

public class L206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode n1 = head, n2 = head.next;
        n1.next = null;
        while (n2 != null) {
            var n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }
        return n1;
    }
}
