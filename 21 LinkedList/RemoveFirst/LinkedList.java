public class LinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("LinkedList is Empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addInMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is Empty.");
            return;
        }

        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is Empty.");
            return;
        }

        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;

        // for (int i = 0; i < size - 2; i++) {
        // temp = temp.next;
        // }

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

        size--;

    }

    public int searchKey(int key) {
        Node temp = head;

        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int search(int key) {
        Node temp = head;
        return helper(temp, key);
    }

    public void reverseHelper(Node head) {
        if (head == null) {
            return;
        }

        reverseHelper(head.next);
        System.out.print(head.data + "->");
    }

    public void reverseLL() {
        Node temp = head;
        reverseHelper(temp);
        System.out.println();
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void removeFromEndAt(int idx) {

        if (idx == size) {
            removeFirst();
            size--;
            return;
        }
        Node temp = head;
        int n = size - idx + 1;
        for (int i = 0; i < n - 2; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if (idx == 1) {
            tail = temp;
        }

        size--;
        return;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // ll.addFirst(5);
        // ll.addFirst(6);
        // ll.addFirst(9);
        // ll.addLast(8);
        // ll.addLast(4);
        // ll.addLast(7);
        // ll.printLinkedList();
        // System.out.println(LinkedList.size);
        // ll.addInMiddle(12, 0);
        // ll.printLinkedList();
        // ll.removeFirst();
        // ll.removeLast();
        // ll.printLinkedList();
        // System.out.println(LinkedList.size);
        // System.out.println(LinkedList.tail.data);

        ll.printLinkedList();
        // System.out.println(ll.searchKey(7));
        // System.out.println(ll.search(7));
        // System.out.println(ll.search(10));
        // ll.reverseLL();
        // ll.reverse();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.removeFromEndAt(5);
        ll.printLinkedList();
        System.out.println(LinkedList.tail.data);

    }

}
