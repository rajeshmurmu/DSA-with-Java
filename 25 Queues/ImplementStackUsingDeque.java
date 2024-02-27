import java.util.*;
import java.util.LinkedList;

public class ImplementStackUsingDeque {

    static class Stack {
        Deque<Integer> d = new LinkedList<>();

        boolean isEmpty() {
            return d.isEmpty();
        }

        void push(int data) {
            d.addLast(data);
        }

        int pop() {
            int data = d.removeLast();
            return data;
        }

        int peek() {
            return d.getLast();
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.peek());
        s.pop();

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }

        System.out.println();
    }
}
