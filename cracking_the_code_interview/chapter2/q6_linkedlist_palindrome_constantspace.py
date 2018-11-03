Time: O(N), traversing the list 
Space: O(1), no extra space, done in place. downside is that input is modified

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        slow = head
        fast = head
        prev = head
        while fast != None and fast.next != None:
            prev = slow
            slow = slow.next
            fast = fast.next.next
        if fast != None:
            slow = slow.next
        if prev != None:
            prev.next = None
        
        slowhead = None
        while slow != None:
            next = slow.next
            slow.next = slowhead
            slowhead = slow
            slow = next
        while head !=  None and slowhead != None:
            if head.val != slowhead.val:
                return False
            head = head.next
            slowhead = slowhead.next
        return True