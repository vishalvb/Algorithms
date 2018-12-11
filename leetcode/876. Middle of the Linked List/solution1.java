

Time: O(N), N = number of nodes in the list. We visit every node twice.
Space: O(1)

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next != null){
            return slow.next;
        }
        else{
            return slow;
        }
        
    }
}