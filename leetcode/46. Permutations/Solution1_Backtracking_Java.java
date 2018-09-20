Time O(n * n!)

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        permutations(result, nums, new ArrayList<>());
        return result;
    }
    
    private void permutations(List<List<Integer>> result, int[] nums, List<Integer> temp){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
        }
        else{
            for(int i = 0 ; i < nums.length; ++i){
                if(!temp.contains(nums[i])){
                    temp.add(nums[i]);
                    permutations(result,nums,temp);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
}