

Time: O(max(m,n)), m = length of l1, n = length of l2
Space complexity : O(max(m,n)). The length of the new list is at most max(m,n)+1.


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode root = dummy;
        int carry = 0;
        int sum = 0;
        while(l1 != null || l2 != null){
            if (l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            root.next = new ListNode(sum % 10);
            carry = sum / 10;
            sum = 0;
            root = root.next;
        }
        if(carry == 1){
            root.next = new ListNode(1);
        }
        return dummy.next;
    }
}