
Time: O(N), N = number of nodes in the list
Space: O(1), constant space

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = head.next.next;
        ListNode prev = head;
        head = head.next;
        while(true){
            a.next = b.next;
            b.next = a;
            a = c;
            if(a == null || a.next == null){
                break;
            }
            b = a.next;
            c = b.next;
            prev.next = b;
            prev = a;
        }
        return head;
    }
}