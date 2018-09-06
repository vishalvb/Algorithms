Complexity Analysis

Since each node in the tree is visited only once, the time complexity is O(n), where n is the number of nodes in the tree. 
We cannot do better than that, since at the very least we have to visit each node to invert it.

Because of recursion, O(h) function calls will be placed on the stack in the worst case, 
where h is the height of the tree. Because h E (belongs to) O(n), the space complexity is O(n).

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
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return root;
        }
        TreeNode right = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(right);
        return root;
    }
}