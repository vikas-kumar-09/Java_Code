package CodingPlatform.LeetCode;

// Delete Node in a Linked List without head pointer
public class DeleteNode_LinkedList{
    public static void main(String[] args){
        
    }
    static void deleteNode(ListNode node) {
        if(node == null || node.next == null){
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
