

Time: O(N), iterative way. 

Space: O(1), no extra space is used.


class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        
        while(p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        
        ListNode preMiddle = p1;
        ListNode preCurrent = p1.next;
        
        // reverse the second half of the list
        while(preCurrent.next!=null){
                ListNode current=preCurrent.next;
                preCurrent.next=current.next;
                current.next=preMiddle.next;
                preMiddle.next=current;
        }
        
        //join two list one by one from each list
        p1=head;
        p2=preMiddle.next;
        while(p1!=preMiddle){
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }  
    }
}