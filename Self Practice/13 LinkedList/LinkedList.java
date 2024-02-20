
public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    Node head;
    Node tail;
    int size;

    void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void removeNthNode(int idx) {
        Node slow = head;
        Node fast = head;

        // if (idx == size) {
        // head = head.next;
        // return;
        // }
        for (int i = 1; i <= idx; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;
            size--;
            return;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        size--;

        if (idx == 1) {
            tail = slow;
        }

    }

    // Find Intersection

    public static Node findInterSection(Node h1, Node h2) {
        Node head1 = h1;
        Node head2 = h2;

        // find length of both linked list
        int s1 = 0;
        int s2 = 0;
        while (head1 != null) {
            s1++;
            head1 = head1.next;
        }

        while (head2 != null) {
            s2++;
            head2 = head2.next;
        }

        for (int i = 1; i <= s1 - s2; i++) {
            head1 = head1.next;
        }

        head1 = h1;
        head2 = h2;
        while (head1 != head2) {

            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;

    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Deleting the middle element of the linked list
    public static void deleteMidElem(Node head) {
        Node slow = head;
        Node fast = head.next.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

    }

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.add(1);
        // ll.add(2);
        // ll.add(3);
        // ll.add(4);
        // ll.add(5);
        // ll.add(6);

        // ll.display();
        // ll.removeNthNode(6);
        // ll.display();
        // System.out.println(ll.size);
        // System.out.println(ll.head.data);
        // System.out.println(ll.tail.data);

        // finding intersection
        // Node a = new Node(100);
        // Node b = new Node(13);
        // Node c = new Node(5);
        // Node d = new Node(12);
        // Node e = new Node(10);

        // Node j = new Node(90);
        // Node k = new Node(9);

        // Node head1 = a;
        // a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;
        // e.next = new Node(12);

        // Node head2 = j;
        // j.next = k;
        // k.next = c;

        // // Node res = findInterSection(head1, head2);
        // // System.out.println(res.data);
        // Node temp = a;
        // while (temp != null) {
        // System.out.print(temp.data + "->");
        // temp = temp.next;
        // }
        // System.out.println("null");
        // Node mid = findMid(head1);
        // System.out.println(mid.data);

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(10);
        ll.add(13);
        ll.add(12);
        ll.add(17);
        ll.add(20);
        ll.add(21);
        ll.display();

        deleteMidElem(ll.head);
        ll.display();

    }
}
