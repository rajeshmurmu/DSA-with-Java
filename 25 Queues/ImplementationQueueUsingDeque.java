import java.util.*;
import java.util.LinkedList;

public class ImplementationQueueUsingDeque {

    static class Queue {
        Deque<Integer> d = new LinkedList<>();

        boolean isEmpty() {
            return d.isEmpty();
        }

        void add(int data) {
            d.addLast(data);
        }

        int remove() {
            return d.removeFirst();
        }

        int peek() {
            return d.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
