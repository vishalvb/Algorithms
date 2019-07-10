
Time:(2^n)


class Solution {
    public String countAndSay(int n) {
        String result = "1";
        if(n <= 0){
            return "-1";
        }
        
        for(int i = 1; i < n; ++i){
            result = getNext(result);
        }
        
        return result;
        
        
    }
    
    private String getNext(String s){
        StringBuilder temp = new StringBuilder();
        int p = 0;
        
        while( p < s.length()){
            char value = s.charAt(p);
            int count = 0;
            while(p < s.length() && s.charAt(p) == value){
                ++p;
                ++count;
            }
            temp.append(String.valueOf(count));
            temp.append(value);
        }
        
        
        
        return temp.toString();
    }
}