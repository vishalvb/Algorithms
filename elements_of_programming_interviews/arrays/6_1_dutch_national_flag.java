time: O(n) // more precisely O(2n)
space:(1)

Explanation: Two pass algorithm. In the first pass, move all the elements smaller than pivot to the left
and in the second pass, move all the elements larger than pivot to the right. 

public static enum Color
{ RED, WHITE, BLUE }

public static void dutch_flag(int pivotIndex, List<Color> A){
	int pivot = A.get(pivotIndex);
	//first pass
	int smaller = 0;
	for(int i = 0 ; i < A.size(); ++i){
		if(A.get(i).ordinal() < pivot.ordinal()){
			Collections.swap(A, smaller++, i);
		}
	}
	int larger = A.size() - 1;
	
	for(int i = A.size() - 1; i >= 0 && A.get(i).ordinal() >= pivot.ordinal(); --i){
		if(A.get(i).ordinal() > pivot.ordinal()){
			Collections.swap(A, larger--, i);
		}
	}
	
	
}