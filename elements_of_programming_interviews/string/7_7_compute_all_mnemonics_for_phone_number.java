
Time:O(4^n), 4 is the length of largest value of mapping of any character
Space:??, mostly O(4^n)

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if(digits == null || digits.length() == 0){
            return result;
        }
        
        String mapping[] = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        result.add("");
        
        for(int i = 0 ; i < digits.length(); ++i){
            char c = digits.charAt(i);
            while(result.peek().length() == i){
                String temp = result.remove();
                for(char ch: mapping[Character.getNumericValue(c)].toCharArray()){
                    result.add(temp + ch);
                }
            }
        }
        
        
        return result;
        
    }
}