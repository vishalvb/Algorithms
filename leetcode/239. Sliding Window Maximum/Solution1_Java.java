Time Complexity
In this algorithm every element is compared at most 2 time to remove from the rear-end of the list
In this algorithm every element on an average is compared at most 1 time to remove from the front-end of the list
Therefore, for every element there are constant number of operations. hence O(N)
The extra space used by this algorithm is O(k) since at any point of the time the maximum length of the list is k.

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        if(nums == null || k <=0){
            return new int[0];
        }
        int lengthNums = nums.length;        
        int result[] = new int [lengthNums - k + 1];
        Deque<Integer> windowQueue = new ArrayDeque<>();
        int resultIndex = 0;
        for(int i = 0 ; i < lengthNums; ++i){
            
            if(!windowQueue.isEmpty() && windowQueue.peek() < i - k + 1){
                windowQueue.poll();
            }
            while(!windowQueue.isEmpty() && nums[windowQueue.peekLast()] < nums[i]){
                windowQueue.pollLast();
            }
            windowQueue.offer(i);
            
            if(i >= k - 1){
                result[resultIndex++] = nums[windowQueue.peek()];
            }
            
        }
        
        return result;
    }
}