public class ReverseLinkedList {
    static class Node {
        int data; Node next;
        Node(int data) { this.data = data; }
    }

    public static Node reverse(Node head) {
        Node prev = null, current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
