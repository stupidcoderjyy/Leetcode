package linked_list;

public class L160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA, n2 = headB;
        //对齐headA和headB
        while (n1 != null && n2 != null) {
            n1 = n1.next;
            n2 = n2.next;
        }
        while (n1 != null) {
            n1 = n1.next;
            headA = headA.next;
        }
        while (n2 != null) {
            n2 = n2.next;
            headB = headB.next;
        }
        //查找相交点
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
