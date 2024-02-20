public class LinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedList {
        Node head;
        Node tail;
        int size;

        // Add element at the first
        void add(int data) {
            Node newNode = new Node(data);
            size++;

            if (head == null) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // Print linked List
        void print() {
            Node temp = head;

            if (head == null) {
                System.out.println("Linked List is Empty.");
                return;
            }

            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Delete element from last index
        Node deleteFromLast(int idx) {

            if (idx < 1 || idx > size) {
                System.out.println("Wrong index");
                return null;
            }

            Node temp = head;
            Node node;
            int n = size - idx + 1;
            if (idx == size) {
                node = temp;
                head = temp.next;
                size--;
                return node;
            }
            for (int i = 1; i < n - 1; i++) {
                temp = temp.next;
            }
            node = temp.next;
            temp.next = temp.next.next;

            if (idx == 1) {
                node = tail;
                tail = temp;
                return node;
            }
            size--;
            return node;
        }

        Node findNthNodeFromLast(int idx) {
            Node slow = head;
            Node fast = head;

            for (int i = 1; i <= idx; i++) {
                fast = fast.next;
            }

            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            return slow;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.add(0);
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        // Node data = ll.deleteFromLast(3);
        ll.print();
        System.out.println("Size is " + ll.size);
        System.out.println("Head is " + ll.head.data);
        System.out.println("Tail is " + ll.tail.data);
        // System.out.println(data.data);

        Node n = ll.findNthNodeFromLast(2);
        System.out.println(n.data);

    }
}