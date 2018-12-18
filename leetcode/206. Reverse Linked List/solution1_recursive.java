

Time: O(N), we are recursively calling every node once. 
Space: O(N), recursion stores call stack. 


class Solution {
    public ListNode reverseList(ListNode head) {
     
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    
}