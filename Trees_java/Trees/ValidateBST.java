public class ValidateBST {
    static class Node {
        int data; Node left, right;
        Node(int data) { this.data = data; }
    }

    public static boolean isValid(Node root, long min, long max) {
        if (root == null) return true;
        if (root.data <= min || root.data >= max) return false;
        return isValid(root.left, min, root.data) &&
               isValid(root.right, root.data, max);
    }
}
