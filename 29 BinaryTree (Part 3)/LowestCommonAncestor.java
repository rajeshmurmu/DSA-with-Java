import java.util.*;

public class LowestCommonAncestor {

    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Solution 1;
    public static Node commonAncestor(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // last common anscestor
        int i = 0;
        while (i < path1.size() && i < path2.size()) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
            i++;
        }

        // last equal node -> i-1th
        Node lca = path1.get(i - 1);
        return lca;

    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {

        if (root == null) {
            return false;
        }

        path.add(root);
        if (root.data == n) {
            return true;
        }

        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        if (foundleft || foundright) {
            return true;
        }

        path.remove(path.size() - 1);

        return false;

    }

    // Solution 2;
    public static Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftlca = lca(root.left, n1, n2);
        Node rightlca = lca(root.right, n1, n2);

        // leftLCA = val rightLCA = null
        if (rightlca == null) {
            return leftlca;
        }

        if (leftlca == null) {
            return rightlca;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right = new Node(3);
        root.right.right = new Node(6);

        // Node root1 = new Node(1);
        // root1.left = new Node(2);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);

        // root.right = new Node(3);
        // root.right.right = new Node(6);

        int n1 = 4, n2 = 6;
        // Node lca = commonAncestor(root, n1, n2);
        // System.out.println(lca.data);
        System.out.println(lca(root, n1, n2).data);
    }
}
