public class Palindrome {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void add(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public Node findMid() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public boolean isPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }

        // find mid
        Node mid = findMid();

        // Reverse mid/2nd half
        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        mid = prev;

        // checking;

        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.add(1);
        p.add(2);
        p.add(1);
        // p.add(1);

        p.print();
        System.out.println(p.isPalindrome());

    }
}
