
public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public static Node head;
    public static Node tail;

    // Methods
    public void addFirst(int data){

        // step1 => create new node
        Node newNode = new Node(data);
        
        if(head==null){
            head = tail = newNode;
            return;
        }

        // step2 => newNode next = head;
        newNode.next = head; // link

        // step3 => newNode
        head = newNode;
    }

    public void addLast(int data){
        // step1 => create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }

        // step2 => point tail next to new node
        tail.next = newNode;

        // step3
        tail = newNode;
    }

    public void printLinkedList(){
        if(head == null){
            System.out.println("Linked List is empty.");
            return;
        }
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.printLinkedList();
        ll.addFirst(2);
        ll.printLinkedList();
        ll.addFirst(1);
        ll.printLinkedList();
        ll.addLast(3);
        ll.printLinkedList();
        ll.addLast(4);
        ll.printLinkedList();
    }
}
