

Time: O(N)
Space: O(N)


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        stack.offerLast(current);
        while(stack.size() > 0){
            TreeNode temp = stack.pollLast();
            result.add(temp.val);
            if (temp.right != null){
                stack.offerLast(temp.right);
            }
            if(temp.left != null){
                stack.offerLast(temp.left);
            }
        }
        return result;
    }
}