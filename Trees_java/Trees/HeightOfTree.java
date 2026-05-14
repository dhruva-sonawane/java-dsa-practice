public class HeightOfTree {
    static class Node {
        int data; Node left, right;
        Node(int data) { this.data = data; }
    }

    public static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
