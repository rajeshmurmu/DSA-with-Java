import java.util.*;
import java.util.LinkedList;

public class StackUsingTwoQues {

    public static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push
        void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // pop
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty.");
                return -1;
            }

            int top = -1;

            // Case I
            if (!q1.isEmpty()) {

                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }

                    q2.add(top);
                }

            } else { // Case II
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;

        }

        // peek
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty.");
                return -1;
            }

            int top = -1;

            // Case I
            if (!q1.isEmpty()) {

                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }

            } else { // Case II
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
