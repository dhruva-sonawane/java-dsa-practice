public class DiameterOfTree {
    static class Node {
        int data; Node left, right;
        Node(int data) { this.data = data; }
    }

    public static int diameter(Node root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int throughRoot = leftHeight + rightHeight + 1;
        return Math.max(throughRoot,
                Math.max(diameter(root.left), diameter(root.right)));
    }

    private static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
