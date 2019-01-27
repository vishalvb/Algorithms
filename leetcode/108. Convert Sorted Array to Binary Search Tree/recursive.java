

Complexity: we can get the position of the root node in const time, the total time complexity would be linear O(N). 
And regarding with the space complexity, 
we need O(logN) for the recursive call parameters and O(N) for the final constructed Binary Search Tree, the it would be totally O(N).

class Solution {
    TreeNode head = null;
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int length = nums.length - 1;
        return helper(nums, 0, length);
        //return head;
    }
    
    private TreeNode helper(int[] nums,int left,int right){
        if(right < left){
            return null;
        }
        int mid  = ((right - left)/2) + left;
        //System.out.println(mid);
        
        TreeNode newnode = new TreeNode(nums[mid]);
        // if(head == null){
        //     head = newnode;
        // }
        newnode.left = helper(nums, left, mid - 1);
        newnode.right = helper(nums, mid + 1, right);
        return newnode;
    }
}