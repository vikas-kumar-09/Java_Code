package LinkedList.My_Practice_LL;

// perfect solution to reverseLL :
public class Reverse_LL {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode pres = head;
            ListNode next = null;
    
            while(pres != null){
    
                next = pres.next;
                pres.next = prev;
                prev = pres;
                pres = next;
            }
            return prev;
        }
    }
}
