public class Implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;
        Node tail;

        // Add element at the first
        void AddFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        // Add element at the Last
        void AddLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Printing the element of a linked list
        void display() {

            Node temp = head;
            if (temp == null) {

                System.out.println("LinkedList is Empty.");
            }

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // find size of linked list
        int size() {
            int size = 0;
            Node temp = head;

            if (temp == null) {
                return size;
            }

            while (temp != null) {
                size++;
                temp = temp.next;
            }

            return size;
        }

        // Insert at any Index
        void insertAt(int data, int idx) {
            Node newNode = new Node(data);
            Node temp = head;
            if (idx == size()) {
                AddLast(data);
                return;
            }

            if (idx == 0) {
                AddFirst(data);
                return;
            }

            if (idx < 0 || idx > size()) {
                System.out.println("Wrong index");
                return;
            }
            int i = 0;
            while (i != idx) {
                if (i == idx - 1) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                    return;

                }
                temp = temp.next;
                i++;
            }
        }

        // Get element by index
        int getElementAt(int idx) {
            if (idx < 0 || idx >= size()) {
                System.out.println("Wrong index");
                return -1;
            }
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }

            return temp.data;
        }

        // Delete element at index

        void deleteElementAt(int idx) {
            Node temp = head;

            if (idx == 0) {
                head = temp.next;
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;

            if (idx == size()) {
                tail = temp;
            }

        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // ll.AddFirst(5);
        // ll.AddFirst(4);
        // ll.AddFirst(3);
        // ll.AddFirst(2);
        // ll.AddFirst(1);

        // ll.AddLast(1);
        // ll.AddLast(2);
        // ll.AddLast(3);
        // ll.AddLast(4);

        // ll.display();
        // System.out.print(ll.size());

        // Here we are able to accessing all the data of the linked list because head
        // element point to first element of the linked list
        // System.out.println(ll.head.data);
        // System.out.println(ll.head.next.data);
        // System.out.println(ll.head.next.next.data);
        // System.out.println(ll.head.next.next.next.data);

        ll.AddLast(4);
        ll.AddLast(5);
        ll.AddLast(12);
        ll.AddFirst(13);
        // ll.display();
        ll.insertAt(10, 4);
        ll.insertAt(100, 0);
        // ll.display();
        // System.out.println(ll.head.data);
        // System.out.println(ll.getElementAt(6));

        ll.display();
        ll.deleteElementAt(5);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println(ll.head.data);
    }
}
