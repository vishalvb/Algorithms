

Time: O(nlogk), n = total number of nodes, k = size of list of lists
Space: O(1)// here i have used recursion to merge, but we can use iterative to use constant space.
		//heere i would say space is length of largest list


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        return helper(lists, 0, lists.length - 1);
        
    }
    private ListNode helper(ListNode[] lists, int start, int end){
        
        if(start == end){
            return lists[start];
        }
         if(start < end){
            int mid = (end + start) / 2; //(end - start)/2 + start;
            ListNode left = helper(lists, start, mid );
            ListNode right = helper(lists, mid + 1, end);
            return merge(left, right);
        }
        else{
            return null;
        }
    }
    
    private ListNode merge(ListNode left, ListNode right){
        if (left == null){
            return right;
        }
        else if(right == null){
            return left;
        }
        if(left.val < right.val){
            left.next = merge(left.next, right);
            return left;
        }
        else{
            right.next= merge(left, right.next);
            return right;
        }
    }
    
    
    
}