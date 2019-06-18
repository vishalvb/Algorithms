time: O(n) 
space:(1)

Explanation: One pass algorithm. We do this by maintaining four subarrays: 
bottom (elements less than pivot), middle (elements equal to pivot), 
unclassified, and top (elements greater than pivot). 
Initially, all elements are in unclassified. We iterate through elements in
unclassified, and move elements into one of bottom, middle, and top groups according
to the relative order between the incoming unclassified element and the pivot.

public static enum Color
{ RED, WHITE, BLUE }

public static void dutch_flag(int pivotIndex, List<Color> A){
	int pivot = A.get(pivotIndex);
	//first pass
	int smaller = 0, equal = 0, larger = A.size() -1;
	while(equal < larger){
		if(A.get(equal).ordinal() < pivot.ordinal()){
			Collections.swap(A, smaller++, equal++);
		}
		else if(A.get(equal).ordinal() == pivot.ordinal()){
			equal++;
		}
		else{
			Collections.swap(A, equal, larger--);
		}
	}
	
	
}