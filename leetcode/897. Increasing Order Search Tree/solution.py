

Time: O(N),
Space O(h), where H is the height of the given tree, and the size of the implicit call stack in our in-order traversal. 



class Solution {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode head = null;
        TreeNode current = null;
        TreeNode temp = null;
        LinkedList<TreeNode> stack = new LinkedList<>();
        current = root;
        while(stack.size() > 0 || current != null){
            
            while(current != null){
                stack.offerLast(current);
                current = current.left;
            }
            current = stack.pollLast();
            if(head == null){
                head = current;
                temp = current;
            }
            else{
                temp.right = current;
                temp = temp.right;
            }
            current.left= null;
            current = current.right;
        }   
        return head;
    }  
}