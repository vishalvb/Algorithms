
Complexity

Time: O(N), N = number of nodes in tree
Space: O(h), h = height of tree. At max h recrusive calls to be stored in memory


class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        if root in (None, p, q):
            return root
        left = Solution.lowestCommonAncestor(self, root.left, p, q)
        right = Solution.lowestCommonAncestor(self, root.right, p, q)
        
        return root if left and right else left or right