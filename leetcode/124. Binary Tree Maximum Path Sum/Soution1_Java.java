
Time: O(n), n = number of nodes in the tree. Since we are accessing every node at max 1 time.
Space: 
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     int maxPathSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
      helper(root);
        return maxPathSum;
        
    }
    private int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(helper(root.left),0);
        int right = Math.max(helper(root.right),0);
        maxPathSum = Math.max(maxPathSum, root.val + left + right);
        return root.val + Math.max(left,right);
    }
}