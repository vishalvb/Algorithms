
Time: O(N), iterating the linkedlist twice, once with slow pointer and once with fast pointer
Space: O(N), using stack to store half of the list. which is n/2, 

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        slow = head
        fast = head
        stack = []
        
        while fast != None and fast.next != None:
            stack.append(slow.val)
            slow = slow.next
            fast = fast.next.next
        if fast != None:
            slow = slow.next
        while slow != None:
            if slow.val != stack.pop():
                return False
            slow = slow.next
        return True