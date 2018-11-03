
Time: List has no cycle:
The fast pointer reaches the end first and the run time depends on the list's length, which is O(n).

List has a cycle:
We break down the movement of the slow pointer into two steps, the non-cyclic part and the cyclic part:

The slow pointer takes "non-cyclic length" steps to enter the cycle. At this point, the fast pointer has already 
reached the cycle. \text{Number of iterations} = \text{non-cyclic length} = NNumber of iterations=non-cyclic length=N

Both pointers are now in the cycle. Consider two runners running in a cycle - the fast runner moves 2 steps 
while the slow runner moves 1 steps at a time. Since the speed difference is 1, 
it takes \dfrac{\text{distance between the 2 runners}}{\text{difference of speed}} 
difference of speed distance between the 2 runners loops for the fast runner to catch up with the slow runner. 
As the distance is at most "\text{cyclic length K}cyclic length K" and the speed difference is 1, we conclude that
\text{Number of iterations} = \text{almost}Number of iterations=almost "\text{cyclic length K}cyclic length K".

Therefore, the worst case time complexity is O(N+K), which is O(n).
Space: O(1), No extra data structure is used, only two pointer are used. 

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        slow = head
        fast = head
        while(fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return True
        return False
