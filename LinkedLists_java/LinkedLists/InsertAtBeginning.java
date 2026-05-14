public class InsertAtBeginning {
    static class Node {
        int data; Node next;
        Node(int data) { this.data = data; }
    }

    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
}
