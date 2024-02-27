import java.util.*;
import java.util.LinkedList;

public class DequeImplementation {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.remove();

        System.out.println(deque);
        System.out.println(deque.getLast());

    }
}
