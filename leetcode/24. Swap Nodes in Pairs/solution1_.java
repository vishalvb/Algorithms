


TIme: O(N)
Space: O(1)

class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode p1 = head;
        if(p1 == null || p1.next == null){
            return head;
        }
        ListNode p2 = p1.next;
        ListNode newHead = head.next;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(p1 != null && p1.next != null){
            ListNode next = p2.next;
            p2.next = p1;
            p1.next = next;
            prev.next = p2;
            prev = p1;
            if (next != null){
                p1 = next;
                p2 = p1.next;    
            }
        }
        return dummy.next;
    }
}