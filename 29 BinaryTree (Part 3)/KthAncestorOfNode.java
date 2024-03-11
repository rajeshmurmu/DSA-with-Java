public class KthAncestorOfNode {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;

        }
    }

    public static int KthAncestor(Node root, int node, int k) {
        if (root == null) {
            return -1;
        }

        if (root.data == node) {
            return 0;
        }

        int leftDist = KthAncestor(root.left, node, k);
        int rightDist = KthAncestor(root.right, node, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);

        if (max + 1 == k) {

            System.out.println(root.data);
        }

        return max + 1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int node = 5, k = 2;

        KthAncestor(root, node, k);
    }
}
