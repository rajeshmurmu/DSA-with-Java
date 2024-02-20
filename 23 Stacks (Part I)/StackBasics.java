import java.util.*;

// Stack Using ArrayList

// public class StackBasics {

// static class Stack {
// static ArrayList<Integer> list = new ArrayList<>();

// // isEmpty
// public static boolean isEmpty() {
// return list.size() == 0;
// }

// // push
// public static void push(int data) {
// list.add(data);
// }

// // pop
// public static int pop() {
// if (isEmpty()) {
// return -1;
// }
// int top = list.get(list.size() - 1);
// list.remove(list.size() - 1);

// return top;
// }

// // peek
// public static int peek() {

// if (isEmpty()) {
// return -1;
// }
// return list.get(list.size() - 1);
// }
// }

// public static void main(String[] args) {
// Stack s = new Stack();
// s.push(1);
// s.push(2);
// s.push(3);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }
// }

// Stack Using Linked List

// public class StackBasics {

//     static class Node {

//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static class Stack {
//         static Node head = null;

//         // isEmpty
//         public boolean isEmpty() {
//             return head == null;
//         }

//         // push
//         public void push(int data) {
//             Node newNode = new Node(data);
//             if (isEmpty()) {
//                 head = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         // pop
//         public int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;

//             return top;
//         }

//         // peek;
//         public int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }

//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }
// }

// Stack Using Collection FrameWork (InBuilt Stack)

public class StackBasics {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}