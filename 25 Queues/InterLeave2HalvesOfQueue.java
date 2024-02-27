import java.util.*;
import java.util.LinkedList;

public class InterLeave2HalvesOfQueue {

    public static void interLeave(Queue<Integer> q) {
        int n = q.size() / 2;

        Queue<Integer> first = new LinkedList<>();
        // Queue<Integer> f = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            first.add(q.peek());
            q.remove();
        }

        // while (!q.isEmpty() && !first.isEmpty()) {
        // f.add(first.peek());
        // f.add(q.peek());

        // first.remove();
        // q.remove();
        // }

        while (!first.isEmpty()) {
            q.add(first.peek());
            q.add(q.peek());

            first.remove();
            q.remove();
        }

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        // q.add(7);
        // q.add(8);
        // q.add(9);
        // q.add(10);

        interLeave(q);
    }
}
