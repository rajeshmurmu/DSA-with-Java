
public class TreeSum {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return sum(root.left) + sum(root.right) + root.data;
    }

    public static void main(String[] args) {

        Node root = new Node(14);
        root.left = new Node(18);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);

        root.right = new Node(19);
        root.right.left = new Node(4);
        root.right.right = new Node(140);

        int sum = sum(root);

        System.out.println(sum);

    }
}
