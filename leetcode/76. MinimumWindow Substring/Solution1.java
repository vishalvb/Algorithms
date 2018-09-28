class Solution {
    public String minWindow(String s, String t) {
        
        if(s.length() < t.length()){
            return "";
        }
        
        Map<Character, Integer> map = new HashMap<>();
        for (char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        
        int left = 0;
        int right = 0;
        int count = t.length();
        int length = Integer.MAX_VALUE;
        int start = 0;
        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                int n = map.get(s.charAt(right)) - 1;
                map.put(s.charAt(right), n);
                if (n >= 0){
                    count--;
                }
            }
            while(count == 0){
                
                if(right - left + 1 < length ){
                    start = left;
                    length = right - left + 1;
                }
                
                if(map.containsKey(s.charAt(left))){
                    int n = map.get(s.charAt(left)) + 1;
                    map.put(s.charAt(left), n);
                    if(n > 0){
                        count++;
                    }
                        
                }
                left++;
            }
            
            ++right;
        }
        
        return start + length > s.length() ? "" :s.substring(start, start+length);
    }
}