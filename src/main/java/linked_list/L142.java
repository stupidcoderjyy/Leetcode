package linked_list;

public class L142 {
    public ListNode detectCycle(ListNode head) {
        ListNode f = head, s = head;
        do {
            if (f == null || s == null || f.next == null) {
                return null;
            }
            f = f.next.next;
            s = s.next;
        } while (f != s);
        s = head;
        while (s != f) {
            s = s.next;
            f = f.next;
        }
        return s;
    }
}
