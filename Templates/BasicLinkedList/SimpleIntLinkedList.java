public class SimpleIntLinkedList {
    public static class Node{
        public int value;
        public Node next;
        public Node(int val) {
            this.value = val;
        }


    }

    public static  void printList(Node head){
        Node pointer = head;
        while(pointer != null){
            System.out.print(pointer.value+" ");
            pointer = pointer.next;
        }
        System.out.println("");
    }

    public static void insert(Node head, Node tail){
        Node pointer = head;
        while(pointer.next != null){
            pointer = pointer.next;
        }
        pointer.next =tail;
    }

    public static void insertSorted(Node head, Node x){
        Node pointer = head;
        if(head.value > x.value){
            x.next = head.next;
            head.next = x;
            int holder = head.value;
            head.value = x.value;
            x.value=holder;
            return;
        }
        while(pointer.next!=null){
            if(pointer.next.value > x.value){
                x.next = pointer.next;
                pointer.next = x;
                return;
            }
            pointer = pointer.next;
        }
        pointer.next = x;
    }

    public static void delete(Node head, int key){
        Node pointer1 = head;
        Node pointer2 = head.next;
        //check to see if the head is the value we need to delete
        if( pointer1.value == key){
            pointer1.value = pointer2.value;
            pointer1.next = pointer2.next;
            return;
        }
        //check to see if any of the nodes in between the head and the tail need to be deleted
        while(pointer2 != null){
            //if the pointer2 value equals the key then delete this node
            if(pointer2.value == key ){
                pointer1.next = pointer2.next;
                return;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        //check to see if the tail is the value that needs to be deleted
        if(pointer1.value == key){
            pointer1 = null;
            return;
        }
    }


    public static void main(String args[]){
        System.out.println("dobra the dog");

        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(6);
        Node n5 = new Node(7);
        Node n6 = new Node(9);

        //insert
        printList(n1); insert(n1,n2); printList(n1); insert(n1,n3); printList(n1);
        insert(n1,n4); printList(n1); insert(n1,n5); printList(n1);

        insertSorted(n1,n6);
        printList(n1);


        //delete
        //delete(n1,4);
        //printList(n1);
        //delete(n1,4);
        //printList(n1);

    }
    
}
