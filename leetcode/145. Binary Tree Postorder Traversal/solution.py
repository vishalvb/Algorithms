# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def postorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        result = []
        stack = []
        current = root
        if not current:
            return result
        stack.append(current)
        while len(stack) > 0:
            current = stack.pop()
            result.insert(0,current.val)
            if current.left:
                stack.append(current.left)
            if current.right:
                stack.append(current.right)
            
        return result
        
        