Time:O(N), in worst case, we need to visit all the nodes of the tree


class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode result = null;
        TreeNode parent = null;
        TreeNode current = root;
        boolean right = false;
        boolean left = false;
        if(root.val == val){
            return root;
        }
        while(current != null){
            parent = current;
            if(current.val == val){
                break;
            }
            if(current.val > val){
                current = current.left;
                left = true;
                right = false;
            }
            else{
                current = current.right;
                right = true;
                left= false;
            }
            
        }
        if(current == null){
            return null;
        }
        
        return parent;
        
    }
}