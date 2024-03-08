import java.util.*;
import java.util.LinkedList;

public class ReverseLevelTravel {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void reverseLevelOrderTraverse(Node root) {
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            // System.out.print(temp.data + " ");
            al.add(temp.data);

            if (temp.right != null) {
                q.add(temp.right);
            }

            if (temp.left != null) {
                q.add(temp.left);
            }
        }

        Collections.reverse(al);
        System.out.println(al);
    }

    public static void main(String[] args) {
        Node root = new Node(14);
        root.left = new Node(18);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);

        root.right = new Node(19);
        root.right.left = new Node(4);
        root.right.right = new Node(140);

        reverseLevelOrderTraverse(root);

        System.out.println();
    }
}
