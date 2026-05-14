public class SearchNode {
    static class Node {
        int data; Node next;
        Node(int data) { this.data = data; }
    }

    public static boolean search(Node head, int key) {
        while (head != null) {
            if (head.data == key) return true;
            head = head.next;
        }
        return false;
    }
}
