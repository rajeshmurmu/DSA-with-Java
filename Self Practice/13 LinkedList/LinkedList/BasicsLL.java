public class BasicsLL {

    // find size outside the class using only head

    public static int size(Node head) {
        int size = 0;

        while (head != null) {
            size++;
            head = head.next;
        }

        return size;
    }

    public static void insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        while (head.next != null) {

            head = head.next;
        }

        head.next = newNode;

    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static void printLinkedList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        // System.out.println();
    }

    public static void displayr(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        displayr(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // storing data to next or storing address of data to next;
        // a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;
        // System.out.println(a.next);
        // System.out.println(b);

        // printing data of b using a.next
        // a.next = b;
        // System.out.println(a.next.data);

        // printing all data using a
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Print basic methood
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        // Print using loop
        // Node temp = a;
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        // Print using function
        // printLinkedList(a);

        // Print using Recursion
        // displayr(a);

        // System.out.println(a.data);

        System.out.println(size(a));
        insertAtEnd(a, 20);
        printLinkedList(a);

    }
}