import java.util.*;
import java.util.LinkedList;

public class TreeTraversal {

    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        int idx = -1;

        Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // In One Line
    // public static void levelOrder(Node root) {
    // Queue<Node> q = new LinkedList<>();
    // q.add(root);
    // q.add(null);

    // while (!q.isEmpty()) {
    // Node temp = q.remove();
    // System.out.print(temp.data + " ");
    // if (temp.left != null) {
    // q.add(temp.left);
    // }

    // if (temp.right != null) {
    // q.add(temp.right);
    // }
    // }
    // }

    // With New Line
    // public static void levelOrder(Node root) {
    // Queue<Node> q = new LinkedList<>();
    // q.add(root);
    // q.add(null);

    // while (!q.isEmpty()) {
    // Node temp = q.remove();
    // if (temp == null) {
    // System.out.println();
    // if (q.isEmpty()) {
    // break;
    // } else {
    // q.add(null);
    // }
    // } else {
    // System.out.print(temp.data + " ");
    // if (temp.left != null) {
    // q.add(temp.left);
    // }

    // if (temp.right != null) {
    // q.add(temp.right);
    // }
    // }
    // }
    // }

    // In One Line Solution II
    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {

                Node temp = q.remove();
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Tree Using Recursion
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree b = new BinaryTree();
        // Node root = b.buildTree(nodes);

        // Manual Tree
        Node root = new Node(14);
        root.left = new Node(18);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);

        root.right = new Node(19);
        root.right.left = new Node(4);
        root.right.right = new Node(140);

        // System.out.println("PreOrder Traverse");
        // preOrder(root);
        // System.out.println("\nInOrder Traverse");
        // inOrder(root);
        // System.out.println("\nPostOrder Traverse");
        // postOrder(root);
        System.out.println("\nLevelOrder Traverse");
        levelOrder(root);
        // System.out.println();

    }
}
