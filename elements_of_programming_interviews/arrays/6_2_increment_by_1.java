time: O(n), n = length of A
Space: O(1)

public static Lst<Integer> plusOne(list<Integer> A){
	
	int n = A.size() - 1;
	A.set(n, A.get(n) + 1);
	for(int i = n;  i> 0 && A.get(i) == 10; i--){
	
		A.set(i, 0);
		A.set(i-1, A.get(i-1) + 1);
	}
	if(A.get(0) == 10){
		A.set(0, 0);
		A.add(0, 1);
	}
	return A;
}