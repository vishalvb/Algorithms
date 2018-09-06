Complexity Analysis

Since each node in the tree is visited only once, the time complexity is O(n), where n is the number of nodes in the tree. 
We cannot do better than that, since at the very least we have to visit each node to invert it.

Space complexity is O(n), since in the worst case, the queue will contain all nodes in one level of the binary tree. 
For a full binary tree, the leaf level has (n/2) = O(n) leaves
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
         if (root == null) return null;
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
        TreeNode current = queue.poll();
        TreeNode temp = current.left;
        current.left = current.right;
        current.right = temp;
        if (current.left != null) queue.add(current.left);
        if (current.right != null) queue.add(current.right);
    }
    return root;
    }
}