
Time: O(N), every node is visited twice, first to find the length and second in the reverse process
Space: O(1), there is no recursive call and only some variables are created. 

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null|| k <= 1){
            return head;
        }
        int length = 0;
        ListNode root = head;
        while(root!=null){
            ++length;
            root = root.next;
        }
        if(length < k){
            return head;
        }
        ListNode result = null;
        int noOfParts = length / k;
        ListNode current = head;
        ListNode prev =null;
        ListNode next = null;
        ListNode prev_temp_head = head;
        for(int i = 0 ; i < noOfParts; ++i){
            
            ListNode temp_head = current;
            for(int j = 0; j < k; ++j){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            if(i == 0){
                result = prev;
            }
            temp_head.next = next;
            
            if(i > 0){
                
                prev_temp_head.next = prev;
                prev_temp_head = temp_head;
            }
        }
        return result;
    }
}