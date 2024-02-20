public class MergeSort {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // mid node
    }

    private static Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public static Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        // left && right MS
        Node newLeft = mergesort(mid);// call for left
        Node newRight = mergesort(rightHead); // call for right

        Node headNode = merge(newLeft, newRight);
        return headNode;

    }

    // public static void main(String[] args) {
    // Node a = new Node(5);
    // Node b = new Node(4);
    // Node c = new Node(3);
    // Node d = new Node(2);
    // Node e = new Node(1);

    // a.next = b;
    // b.next = c;
    // c.next = d;
    // d.next = e;
    // e.next = null;

    // // 5 4 2 3 1

    // Node head = a;

    // mergesort(head);

    // Node temp = head;
    // while (temp != null) {
    // System.out.print(temp.data + " ");
    // temp = temp.next;
    // }

    // System.out.println();

    // }

    public static class linkedList {
        private Node head;
        private Node tail;

        void addFirst(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;

        }

        void display(Node head) {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.head = mergesort(ll.head);
        ll.display(ll.head);
    }
}
