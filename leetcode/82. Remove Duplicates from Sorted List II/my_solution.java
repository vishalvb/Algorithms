

Time: O(n), every node is checked once
Space: O(1), no extra space is used except variables

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy.next;
        ListNode prev = dummy;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
               // System.out.println(current.val);
                int data = current.val;
                while(current != null && current.val == data){
                    current = current.next;
                    if(current == null){
                        prev.next = current;
                        break;
                    }
                }
                prev.next = current;
            }
            else{
                prev = current;
                current = current.next;
            }
            
        }
        return dummy.next;
    }
}