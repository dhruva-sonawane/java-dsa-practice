public class MergeTwoSortedLists {
    static class Node {
        int data; Node next;
        Node(int data) { this.data = data; }
    }

    public static Node merge(Node a, Node b) {
        Node dummy = new Node(0), tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a; a = a.next;
            } else {
                tail.next = b; b = b.next;
            }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }
}
