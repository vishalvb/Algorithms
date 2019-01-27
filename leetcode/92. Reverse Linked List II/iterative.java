
Time Complexity: O(N) considering the list consists of N nodes. We process each of the nodes at most once 
(we don't process the nodes after the nth node from the beginning.
Space Complexity: O(1) since we simply adjust some pointers in the original linked list and only use O(1)
 additional memory for achieving the final result. 



class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previous = dummy;
        ListNode current = head;
        int i =1;
        for( i = 1; i < m; ++i){
            previous = current;
            current = current.next;
        }
        ListNode savenext = current;
        ListNode tempPrev = null;
        ListNode tempNext = null;
        ListNode next = null;
        while(i <=n ){
            if(i ==n){
               tempNext = current.next; 
            }
                next = current.next;
                current.next = tempPrev;
                tempPrev = current;
                current = next;
            ++i;
        }
        
        previous.next = tempPrev;
        savenext.next = next;
        return dummy.next;
        
    }
    
    
}