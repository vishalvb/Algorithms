
Time: O(n) n = length of the string


class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.length() == 0 || s == null){
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;
        
        while(head < tail){
            while(!Character.isLetterOrDigit(s.charAt(head)) && head  < tail){
                ++head;
            }
            while(!Character.isLetterOrDigit(s.charAt(tail)) && head < tail){
                --tail;
            }
            
            if(Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail))){
                return false;
            }
            ++head;
            --tail;
            
            
            
        }
        return true;
    }
}