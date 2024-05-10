package LinkedList.Practice_LL_Interview_Question;

public class DoubleLL {
    private Node head;
    private Node tail;

    // Insert value at Double LL

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(node != null){
            System.out.println(node.val + " -> ");
            node = node.next;
        }
        node = head;
    }

    // To Display the LinkedList
    public void display(){
        Node node = head;
        if (node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("END");
    }


    private class Node{
        int val;
        Node next;
        Node prev;
        
        private Node(int val) {
            this.val = val;
        }
        private Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

}
