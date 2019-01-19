

Time complexity : O(n). Because each node in the list is checked exactly once to determine if it is a duplicate or not, 
	the total run time is O(n), where nn is the number of nodes in the list.

Space complexity : O(1). No additional space is used.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode current = head;
        while(current != null){
            ListNode runner = current.next;
            while(runner != null && runner.val == current.val){
                runner = runner.next;
            }
            current.next = runner;
            current = current.next;
        }
        return head;
    }
}