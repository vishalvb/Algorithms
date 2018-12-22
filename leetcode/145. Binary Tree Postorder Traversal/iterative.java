
Time: O(N)
Space: O(N)

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        stack.offerLast(current);
        while(stack.size() > 0){
            TreeNode temp = stack.pollLast();
            result.add(0, temp.val);
            if (temp.left != null){
                stack.offerLast(temp.left);
            }
            if(temp.right != null){
                stack.offerLast(temp.right);
            }
        }
        return result;
    }
}