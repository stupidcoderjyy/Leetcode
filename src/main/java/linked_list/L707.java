package linked_list;

public class L707 {
    public static class MyLinkedList {
        int length = 0;
        ListNode root = new ListNode(-1);

        public MyLinkedList() {
        }

        public int get(int index) {
            ListNode node = findNode(index);
            if (node == null) {
                return -1;
            }
            return node.val;
        }

        public void addAtHead(int val) {
            root.next = new ListNode(val, root.next);
            length++;
        }

        public void addAtTail(int val) {
            if (length == 0) {
                addAtHead(val);
                return;
            }
            ListNode node = findNode(length - 1);
            node.next = new ListNode(val);
            length++;
        }

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > length) {
                return;
            }
            if (index == 0) {
                addAtHead(val);
                return;
            }
            ListNode node = findNode(index - 1);
            node.next = new ListNode(val, node.next);
            length++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= length) {
                return;
            }
            if (index == 0) {
                root.next = root.next.next;
                return;
            }
            ListNode node = findNode(index - 1);
            node.next = node.next.next;
            length--;
        }

        private ListNode findNode(int i) {
            if (i < 0 || i >= length) {
                return null;
            }
            ListNode node = root;
            for (int j = 0; j <= i ; j++) {
                node = node.next;
            }
            return node;
        }
    }
}
