
Time: O(n*m), m partial products with at most n+1 digits, we perform O(1)operations on each digit in each partial products

Space: O(n + m) the number of digits required for the product is at most n + m for n and m digit operands. 


public static List<Integer> multiply(List<Integer> nums1, List<Integer> nums2){
	final int sign = nums1.get(0) < 0 ^ nums2.get(0) < 0 ? -1 : 1;
	
	nums1.set(0, Math.abs(nums1.get(0));
	nums2.set(0, Math.abs(nums2.get(0));
	
	List<Integer> result = new ArrayList<>(Collections.ncopies(nums1.size() + nums2.size(), 0));
	
	for(int i = nums1.size() - 1; i >= 0; --i){
		for(int j = nums2.size() - 1; j >= 0; --j){
			result.set(i + j + 1, result.get(i + j + 1) + (nums.get(i) + nums.get(j));
			result.set(i + j, result.get(i+j) + result.get(i + j + 1)/10);
			result.set(i + j + 1, result.get(i + j + 1) %10);
			
		}
	}
	
	int final_non_zero = 0;
	while(final_non_zero < result.size() && result.get(final_non_zero) == 0){
		++final_non_zero;
	}
	result = result.subList(final_non_zero, result.size());
	if(result.isEmpty())
		return Arrays.asList(0);
	result.set(0, result.get(0) * sign);
	return result;
}