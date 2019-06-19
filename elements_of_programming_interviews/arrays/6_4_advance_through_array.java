time: O(n), n = length of the array
space: O(1)

Explanation: iterate through the array and keep a variable which stores the maximum index we can reach.
At the end compare that index with the size of the array. 


public static boolean canReachEnd(List<Integer> A){
	int furthestReachSoFar = 0;
	int lastIndex = A.size() - 1;
	
	for(int i = 0; i <= furthestReachSoFar && furthestReachSoFar < lastIndex ; ++i){
		furthestReachSoFar = Math.max(furthestReachSoFar, i + A.get(i));
	}
	return furthestReachSoFar >= lastIndex;
}