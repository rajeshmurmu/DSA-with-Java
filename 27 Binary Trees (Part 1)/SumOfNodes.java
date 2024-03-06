public class SumOfNodes {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static class BinaryTree {
        int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int lsum = sumOfNodes(root.left);
            int rsum = sumOfNodes(root.right);

            return root.data + lsum + rsum;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        System.out.println(tree.sumOfNodes(root));
    }
}
