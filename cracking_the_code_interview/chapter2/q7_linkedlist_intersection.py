
Time complexity : O(m+n). m = number of nodes in A, n = number of nodes in B

Space complexity : O(1).


class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        a = headA
        b = headB
        while a!= None and b!= None:
            if a == b:
                return a
            a = a.next
            b = b.next
            if a == None:
                a = headB
            elif b == None:
                b = headA
        return None