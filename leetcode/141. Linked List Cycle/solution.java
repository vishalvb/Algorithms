
Time:O(N), N = number of nodes in the list, we are visiting each node twice

O(n). Let us denote nn as the total number of nodes in the linked list. To analyze its time complexity, we consider the following two cases separately.

List has no cycle:
The fast pointer reaches the end first and the run time depends on the list's length, which is O(n).

List has a cycle:
We break down the movement of the slow pointer into two steps, the non-cyclic part and the cyclic part:

The slow pointer takes "non-cyclic length" steps to enter the cycle. At this point, the fast pointer has already reached the cycle.
Number of iterations=non-cyclic length=N

Both pointers are now in the cycle. Consider two runners running in a cycle - the fast runner moves 2 steps while the slow runner moves 1 steps at a time. 
Since the speed difference is 1, it takes difference of speed distance between the 2 runners loops for the fast runner to catch up with the slow runner. 
As the distance is at most "cyclic length K" and the speed difference is 1, we conclude that
Number of iterations=almost "cyclic length K".



Space: O(1), constant space is used

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        
        return false;
        
    }
}