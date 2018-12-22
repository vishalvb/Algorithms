

Time: O(N)
Space: O(N)


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        //stack.push(current);
        while(stack.size() > 0|| current != null){
            while(current != null){
                stack.offerLast(current);
                current = current.left;
                
            }
            current = stack.pollLast();
            result.add(current.val);
            current = current.right;
            //stack.push(current);
        }
        return result;
    }
}