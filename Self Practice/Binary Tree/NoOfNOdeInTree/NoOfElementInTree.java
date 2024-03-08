
public class NoOfElementInTree {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int noOfElement(Node root) {
        if (root == null) {
            return 0;
        }

        return noOfElement(root.left) + noOfElement(root.right) + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(14);
        root.left = new Node(18);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);

        root.right = new Node(19);
        root.right.left = new Node(4);
        root.right.right = new Node(140);

        int size = noOfElement(root);

        System.out.println(size);

    }
}
