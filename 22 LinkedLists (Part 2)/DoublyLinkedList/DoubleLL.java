public class DoubleLL {

    public class Node {
        int data;
        Node next = null;
        Node prev = null;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst;
    void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;

    }

    void removeFirst() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty.");
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    void removeLast() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty.");
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }

        tail = tail.prev;
        tail.next = null;
        size--;
    }

    void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    void printForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void printBackward() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();

        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.addLast(100);
        // dll.removeFirst();
        // dll.printForward();
        // dll.printBackward();
        // System.out.println(size);

        // System.out.println(head.prev.data);
        // System.out.println(head.data);
        // System.out.println(head.next.data);

        dll.printForward();
        dll.reverse();
        dll.printForward();
    }
}
