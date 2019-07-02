Time: O(n)
space: O(1)

public static int replaceAndRemove(int size, char[] s){
	int writeIdx = 0;
	int aCount = 0;
	
	for(int i = 0 ; i < size; ++i){
		
		if(s[i] == 'b'){
			s[writeIdx++] = s[i];
		}
		if(s[i] =='a'){
			++aCount;
		}
		
	}
	
	int curIdx = writeIdx - 1;
	writeIdx = writeIdx + aCount - 1;
	final int finalSize = writeIdx + 1;
	
	while(curIdx >=0 ){
		if(s[curIdx] == 'a'){
			s[writeIdx--] = 'b';
			s[writeIdx--] = 'b';
		}
		else{
			s[writeIdx--] = s[curIdx];
		}
		curIdx--;
		
	}
	
	return finalSize;
	
	
}