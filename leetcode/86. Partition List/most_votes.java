
Time: O(N), N = number of nodes in the list. We are visiting each node once. 
Space: O(1), constant extra space is used. 


class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode link = dummy2;
        ListNode newhead = dummy1;
        while(head != null){
            ListNode next = head.next;
            if(head.val < x){
                dummy1.next = head;
                head.next = null;
                dummy1 = dummy1.next;
            }
            else{
                dummy2.next = head;
                head.next = null;
                dummy2 = dummy2.next;
            }
            
            head = next;
        }
        dummy1.next = link.next;
      
        return newhead.next;
    }
}