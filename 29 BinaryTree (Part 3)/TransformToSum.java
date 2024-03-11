import java.util.*;
import java.util.LinkedList;

public class TransformToSum {

    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int transformToSum(Node root) {
        if (root == null) {
            return 0;
        }

        int lsum = transformToSum(root.left);
        int rsum = transformToSum(root.right);

        int total = lsum + rsum;
        int val = root.data;
        root.data = total;
        return val + total;

    }

    // level order printing
    public static void display(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                q.add(temp.left);
            }

            if (temp.right != null) {
                q.add(temp.right);
            }
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transformToSum(root);
        display(root);
    }
}
