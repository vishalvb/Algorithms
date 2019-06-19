Time:(n), n = length of the array
Space; O(1)

explanation: iterate through the array and compare the previous element. If it is not same, then shift elements
by 1 position to the left. 


public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int length = nums.length;
        int index = 1;
        for(int i = 1; i < length; ++i){
            if(nums[index - 1] != nums[i]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }