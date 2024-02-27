
public class QueueUsingLinkedLIst {
    // Node for linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queues
    static class Queue {
        Node head;
        Node tail;

        boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove
        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }
            int front = head.data;

            // while single element in queue
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;

            }
            return front;
        }

        // peek
        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
