

Time complexity : O(m*n). In worst case(skewed tree) function takes O(m*n) time.
m = number of nodes in s
n = number of nodes in t


Space complexity : O(n). The depth of the recursion tree can go upto n. n refers to the number of nodes in s.

class Solution(object):
    def isSubtree(self, s, t):
        """
        :type s: TreeNode
        :type t: TreeNode
        :rtype: bool
        """
        if t is None:
            return True
        else:
            return self.help(s, t)
    
    def help(self, s, t) :
        if s is None:
            return False
        if self.helper(s, t):
            return True
        else:
            return self.help(s.left, t) or self.help(s.right, t)
            
    def helper(self, s, t):
        if s is None and t is None:
            return True
        elif s is None or t is None:
            return False
        elif s.val != t.val:
            return False
        else:
            return (self.helper(s.left, t.left) and self.helper(s.right, t.right))