package LinkedList;
// import java.util.Objects;

public class DLL {

    private Node head;
    private Node tail;

    // To insert into first place
    public void insertFirst(int val){

        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node; 
        }
        head = node;   // node = newnode

         // try{
        // head.prev = node; 
           
        // }
        // catch(Exception e){
        //    System.out.println(e.getMessage());
        // }
    }
     // Insert into last place in LL
     public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
     }

     // Insert after a particaular value
     public Node findNodeP(int value){
        Node  node = head;
         while (node != null) {
          if(node.val == value) {
            return node;
          }
          node = node.next;
         }
         return null;
   }
   // Insert after a particaular value
     public void insert(int after, int val){
       Node p =findNodeP(after);

       if( p == null){  // what if p does noot exist
         System.out.println("does not exist");
         return;
       }

       Node node = new Node(val);
       node.next = p.next;
       p.next = node;
       node.prev = p;
       if (node.next != null){
       node.next.prev = node;
       }
     }

    public void Display(){
        Node node = head;   // temp = node
        // Node last = null; //last = tail
        while (node != null){
            System.out.print(node.val + " -> ");
            // last = node;  // reverse
            node = node.next;
        }
        System.out.println("END");

        // printing in reverse
        // System.out.println("printing in reverse");
        // while (last!= null){
        //     System.out.print(last.val + " -> ");
        //     last = last.prev;
        // }
        // System.out.println("START");
    }

    private class Node{

        int val;
        Node next;
        Node prev;
        
        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
