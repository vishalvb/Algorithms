

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
     
        if(head == null){
            return null;
        }
        
        return BST(head,null);
        
    }
    
    
    public TreeNode BST(ListNode head, ListNode tail){
        
        if(head == tail){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != tail && fast.next != tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        TreeNode thead = new TreeNode(slow.val);
        thead.left = BST(head,slow);
        thead.right = BST(slow.next,tail);
        return thead;
    }
}