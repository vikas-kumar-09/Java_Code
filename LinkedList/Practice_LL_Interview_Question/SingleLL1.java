package LinkedList.Practice_LL_Interview_Question;

public class SingleLL1 {
  public static Node head;
  private Node tail;

  private int size;
  private Object next;

  public SingleLL1(){
    this.size = 0;
  }

  //Insert value at first index
  public void insertFirst(int val){
    Node node = new Node(val);
    node.next = head;
    head = node;

    if(tail == null){
      tail = head;
    }
    size += 1;
  }

  // Insert last in LinkedList
  public void insertLast(int val){
    if(tail == null){
      insertFirst(val);
      return;
    }
    // tail.next = no
    Node node = new Node(val);
    tail.next = node;
    tail = node;
    size++;
  }

  // insert at particular index
  public void insert(int value, int index){
    if(index == 0){
      insertFirst(value);
      return;
    }
    if(index == size){
      insertLast(value);
      return;
    }
    Node temp = head;
    for(int i=1; i<index; i++){
      temp = temp.next;
    }
    Node newNode = new Node(value, temp.next);
    temp.next = newNode;
    size++;
  }

  // delete first elemet
  public int deleteFirst(){
    int val = head.value;
    head = head.next;
     if(head == null){
      tail = null;
     }
     size--;
     return val;
  }

  //delete last element in LL
  public int deleteLast(){
    if(size <= 1){
      return deleteFirst();
    }
    Node secondlastNode = get(size-2);
    int val = tail.value;
    tail = secondlastNode;
    tail.next = null;
    return val;
  }
  
  public Node get(int index){
    Node node = head;   // node = temp;

    for(int i=0; i<index; i++){
      node = node.next;
    }
    return node;
  }

  // display the Linkedlist
  public void display(){
    Node temp = head;

    while(temp !=null){
      System.out.print(temp.value + " -> ");
      temp = temp.next;
    }
    System.out.println("End");
  }

  private class Node{
        private int value;
        // @SuppressWarnings("unused")
        private Node next;
        public Node head;

        private Node(int value) {
          this.value = value;
        }
        private Node(int value, Node next) {
          this.value = value;
          this.next = next;
        }
        // public Node next() {
        //   // TODO Auto-generated method stub
        //   throw new UnsupportedOperationException("Unimplemented method 'next'");
        // }    
  }
   // ***************** LinkedList Interview Question ****************************
   // Sort the Linkedlist using merge sort
  public Node SortList(Node Head){
    if (head == null || head.next == null){
      return head; 
    }
      Node mid = middleNode(head);
      Node left = SortList(head);
      Node right = SortList(mid);

      return merge(left, right);
  }
  public  Node merge(Node first, Node second){
    Node f = first.head;
    Node s = second.head;

    SingleLL1 ans = new SingleLL1();

    while (f != null && s !=null){
      if(f.value < s.value){
        ans.insertLast(f.value);
        f = f.next;
      } else {
          ans.insertLast(s.value);
          s = s.next;
      }
    }
    while (f != null){
      ans.insertLast(f.value);
      f = f.next;
    }
    while (s != null){
      ans.insertLast(s.value);
      s = s.next;
    }
    return ans;
  }
  public Node middleNode(Node head) {
    Node slow = head;
    Node fast = head;

    while (slow != null && fast.next !=null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
}



  // Q. Remove duplicates and return the list in sorted manner 
  public void duplicates(){
    Node node = head;

    while (node.next != null){

      if(node.value == node.next.value){
        node.next = node.next.next;
        size--;
      }
      else{
         node = node.next;
      }
    }
    tail = node;
    tail.next = null;
  }

  // merge two sorted LL :
    public  Node merge(Node first, Node second){
      Node f = first.head;
      Node s = second.head;

      SingleLL1 ans = new SingleLL1();

      while (f != null && s !=null){
        if(f.value < s.value){
          ans.insertLast(f.value);
          f = f.next;
        } else {
            ans.insertLast(s.value);
            s = s.next;
        }
      }
      while (f != null){
        ans.insertLast(f.value);
        f = f.next;
      }
      while (s != null){
        ans.insertLast(s.value);
        s = s.next;
      }
      return ans;
    }

    // Cycle is present in LL or not (Cycle Deduction Method) :
    public static boolean hasCycle(Node head){
      Node fast = head;
      Node slow = head;

      while (fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;

        if(fast == slow){
          return true;
        }
      }
      return false;
    }

    // length of a cycle LinkedList
    public int lengthCycle(Node head){
      Node fast = head;
      Node slow = head;

      while (fast != null && fast.next !=null){
        fast = fast.next.next;
        slow = slow.next;
        
        if (fast == slow){
          // calculate the length
          Node temp = slow;
          int length = 0;
          do{
            temp = temp.next;
            length++;
          }while(temp != slow);
            return length;
          } 
        }
        return 0;
      }
    // }

    // Happy Number is present or not
    public boolean isHappy(int n){
      int slow = n;
      int fast = n;

      do{
        slow = findSquare(slow);
        fast = findSquare(findSquare(fast));
      }while(slow != fast);

      if (slow == 1){
        return true;
      }
      return false;
    }
    private int findSquare(int number){
      int ans = 0;
      while (number > 0){
        int rem = number % 10;
        ans += rem * rem;
        number /= 10;
      }
      return ans;

    }

    // Find the Middle of Linkedlist 
    public Node middleNode1(Node head) {
        Node slow = head;
        Node fast = head;

        while (slow != null && fast.next !=null){
          slow = slow.next;
          fast = fast.next.next;
        }
        return slow;
    }
    // Reverse LinkedList using Recursion
    private void reverseList(Node node){
         if(node == tail){
          head = tail;
          return;
         }
          reverseList(node.next);
          tail.next = node;
          tail = node;
          tail.next = null;
    }

    // Reverse LinkedList using Iterative method :
    Node reverseList1(Node head)
    {
        Node current = head;
        Node previous = null;
        Node next = null;
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return  previous;
        
    }

    // Palindrome of a LinkedList :
    public boolean isPalidrome(Node head){

      Node mid = middleNode(head);
      // reverse the second half
      Node headSeond = reverseList(mid);
      Node re_reverse = headSeond;

      // compare both the halves
      while (head != null && headSeond != null){
          if (head.value != headSeond.value){
            break;
          }
          head = head.next;
          headSeond = headSeond.next;
      }
      reverseList(re_reverse);

      return head == null || headSeond == null;
    }
  public static void main(String[] args) {
    
    // SingleLL1 ll = new SingleLL1();
    // ll.insertLast(1);
    // ll.insertLast(1);
    // ll.insertLast(2);
    // ll.insertLast(3);
    // ll.insertLast(3);

    // ll.display();
    // ll.duplicates();
    // ll.display();

    // SingleLL1 first = new SingleLL1();
    // SingleLL1 second = new SingleLL1();

    // first.insertLast(1);
    // first.insertLast(3);
    // first.insertLast(5);

    // second.insertLast(1);
    // second.insertLast(2);
    // second.insertLast(9);
    // second.insertLast(14);

    // SingleLL1 ans = SingleLL1.merge(first, second);
    // ans.display();

    SingleLL1 fast = new SingleLL1();
    SingleLL1 second = new SingleLL1();

    fast.insertLast(12);
    fast.insertLast(13);
    fast.insertLast(14);

    second.insertLast(15);
    second.insertLast(16);
    second.insertLast(17);

    // SingleLL1 ans = SingleLL1.hasCycle(fast, second);

    SingleLL1 ans = new SingleLL1();
    ans.insertFirst(10);
    ans.insertFirst(12);
    ans.insertFirst(13);
    ans.insertFirst(14);

    ans.display();
    // ans.hasCycle(head);
    ans.display();
  }
}