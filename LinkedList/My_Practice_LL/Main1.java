package LinkedList.My_Practice_LL;

// import LinkedList.My_Practice_LL.ReverseList_LL.Node;

public class Main1 {
    public static void main(String[] args) {

        SortLL ll = new SortLL();

        ll.insertFirst(12);
        ll.insertFirst(13);

        ll.insertFirst(33);
        ll.insertFirst(10);
         System.out.println("Before sorting : ");
        ll.display();
         
        System.out.println("After sorting : ");
        ll.bubbleSort();
        ll.display();
        
        // InsertFirstValue LL = new InsertFirstValue();
        // Insert_Value ll = new Insert_Value();
        // ll.insertFirst(10);
        // ll.insertFirst(20);
        // ll.insertFirst(30);
        // ll.insertFirst(40);

        // ll.display();

        // ll.insertFirst(44);
        // ll.display();

        // ReverseList_LL ll = new ReverseList_LL();

        // ll.insertFirst(12);
        // ll.insertFirst(13);
        // ll.insertFirst(14);
        // ll.insertFirst(15);
        // ll.display();
        
        // // Node head;
        // // Node head = ll.reverseList(head);
        //  ll.getLength();

        // ll.display();


    }
}
