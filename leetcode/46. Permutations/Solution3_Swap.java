class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        helper(nums, res, 0, new ArrayList<>());
        return res;
    }
    
    public void helper(int[] nums, List<List<Integer>> res, int index, List<Integer> path) {
        if (index == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            swap(nums, i, index);
            helper(nums, res, index + 1, path);
            swap(nums, i, index);
            path.remove(path.size() - 1);
        }
    }
    
    public void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}