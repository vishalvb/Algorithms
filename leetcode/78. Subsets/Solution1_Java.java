Time Complexity: O(2^n)

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> subsets = new ArrayList<>();
        if(nums.length == 0 || nums == null){
            return subsets;
        }
        subsets.add(new ArrayList<>());
        for(int i = 0 ; i < nums.length; ++i){
            int size = subsets.size();
            for(int j = 0 ; j < size; ++j){
                List<Integer> temp = new ArrayList(subsets.get(j));
                temp.add(nums[i]);
                subsets.add(temp);
            }
        }
        
        return subsets;
    }
}