public class LowestCommonAncestor {
    static class Node {
        int data; Node left, right;
        Node(int data) { this.data = data; }
    }

    public static Node lca(Node root, int a, int b) {
        if (root == null) return null;
        if (root.data == a || root.data == b) return root;

        Node left = lca(root.left, a, b);
        Node right = lca(root.right, a, b);

        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }
}
