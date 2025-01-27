package linked_list;

public class L19 {
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode[] nodes = new ListNode[30];
        int len = 0;
        ListNode node = head;
        while (node != null) {
            nodes[len++] = node;
            node = node.next;
        }
        if (len == 1) {
            return null;
        }
        if (n == len) {
            return head.next;
        }
        int i = len - n;
        nodes[i - 1].next = nodes[i].next;
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        //s + 1为倒数第n个元素
        ListNode s = dummy, f = dummy;
        for (int i = 0; i < n; i++) {
            f = f.next;
        }
        while (f.next != null) {
            s = s.next;
            f = f.next;
        }
        s.next = s.next.next;
        return dummy.next;
    }
}
