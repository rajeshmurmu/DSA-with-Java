
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
    public static int size;

    // Methods
    public void addFirst(int data){

        // step1 => create new node
        Node newNode = new Node(data);
        size++;
        
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
        size++;

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

    public void add(int idx, int data){

        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);

        ll.printLinkedList();
        System.out.println(LinkedList.size);
    }
}
