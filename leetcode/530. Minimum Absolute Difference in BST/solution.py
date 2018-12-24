
Time: O(N), n is the number of nodes
Space: O(h), h is height of the tree

class Solution {
    int result = Integer.MAX_VALUE;
    Integer pre = null;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return result;
    }
    
    private void helper(TreeNode root){
        if (root.left != null){
            helper(root.left);
        }
        
        if (pre != null){
            result = Math.min(result, root.val - pre);
        }
        pre = root.val;
        if(root.right != null){
            helper(root.right);
        }
        
    }
}