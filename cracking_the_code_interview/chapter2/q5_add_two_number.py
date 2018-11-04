Time: O(max(m,n)), Assume that m and n 
represents the length of l1 and l2 respectively, the algorithm above iterates at most max(m,n) times
space: O(max(m,n)) The length of the new list is at most max(m,n)+1


class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        root = ListNode(0)
        head = root
        carry = 0
        sum = 0
        while l1 or l2:
            if l1:
                sum += l1.val
                l1 = l1.next
            if l2:
                sum += l2.val
                l2 = l2.next
            sum += carry
            root.next = ListNode(sum % 10)
            carry = sum/10
            sum = 0
            root = root.next
        if carry:
            root.next = ListNode(carry)
        return head.next
        
        