Time: O(n (1 + Logb2 b1))
where n is the length of s. The reasoning is as follows. 
First, we perform n multiply-and-adds to get x from s. 
Then we perform (logb2 x) multiply and adds to get the result. 
The value x is upper-bounded by b1 ^n, and logb2(b1 ^ n) = nlogb2 ^ b1.




public static string convertBase(String s, int b1, b2){
	
	boolean isNegative = s.startsWith('-');
	int num = 0;
	for(int i = *isNegative ? 1 : 0) ; i < s.length(); ++i){
		
		num *= b1;
		num += Character.isDigit(s.charAt(i)) ? s.charAt(i) - '0' : s.charAt(i) - 'A' + 10;
		
	}
	
	return (isNegative ? "-" : "") + (num == 0 ? '0' : constructFromBase(num, b2));
}

public static string constructFromBase(int num, int base){
	return num == 0 ? "" : constructFromBase(num /10, base) + (char) (num%base >=10 ? 'A' + num%base - 10 : '0' + num%base);
	
}