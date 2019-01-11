

Time: O(N), n = number of nodes in linked list. 
Space: O(1), constant space

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode p2 = head;
        for(int i = 0; i < n; ++i){
            p2 = p2.next;
            
        }
        ListNode p1 = root;
        while(p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        
        p1.next = p1.next.next;
        return  root.next;
    }
}