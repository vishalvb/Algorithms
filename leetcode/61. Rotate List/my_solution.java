
Time: O(N), N = number of nodes. At max every node is visited twice, once by p1 pointer and second by p2 pointer. 
Space: O(1), No extra space is required



class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null ||head.next == null|| k ==0){
            return head;
        }
        ListNode root = head;
        int length = 0;
        while(root != null){
            ++length;
            root = root.next;
        }
        int temp = 0;
        if (k > length){
            temp = k % length;    
        }
        else{
            temp = k;
        }
        k = temp;
        //System.out.println("k="+k);
        ListNode p1 = head;
        ListNode p2 = head;
        for(int i = 0; i < k; ++i){
            if(p2.next == null){
                p2 = head;
            }
            else{
                p2 = p2.next;
            }
        }
        if(p1 == p2){
            return p1;
        }
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        ListNode result = null;
        if(p1.next == null){
            result = p1;
        }
        else{
            result = p1.next;
        }
        p1.next = null;
        p2.next = head;
        return result;
    }
}