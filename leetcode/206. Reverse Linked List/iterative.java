

Time: O(N), N = number of the nodes in the linkedlist.
Space: O(1), iterative, constant space only. 


class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
      return prev;  
    }
}