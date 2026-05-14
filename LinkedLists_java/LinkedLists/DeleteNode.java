public class DeleteNode {
    static class Node {
        int data; Node next;
        Node(int data) { this.data = data; }
    }

    public static Node delete(Node head, int key) {
        if (head == null) return null;
        if (head.data == key) return head.next;
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        if (current.next != null) current.next = current.next.next;
        return head;
    }
}
