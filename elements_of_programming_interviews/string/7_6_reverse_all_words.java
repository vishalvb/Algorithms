
Time: O(n), n = length of the string
SpacE: O(1)

explanation: in first pass, we reverse the word by word and in the second pass we clean the space
between the words or at the edges of the string. 



class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        
        char ch[] = s.toCharArray();
        int start = 0;
        for(int i = 0 ; i < ch.length; ++i){
            if(ch[i] == ' '){
                reverse(ch, start, i - 1);
                start = i + 1;
            }
        }
        reverse(ch, start, ch.length - 1);
        
        int i = 0;
        int j = 0 ;
        int n = ch.length;
        while(j < n){
            while(j < n && ch[j] == ' ')j++;
            while(j < n && ch[j] != ' ')ch[i++] = ch[j++];
            while(j < n && ch[j] == ' ')j++;
            if(j < n)ch[i++] = ' ';
        }
        
        return new String(ch).substring(0, i);
        
    }
    
    private void reverse(char[] ch, int start, int end){
        while(start < end){
            char temp = ch[start];
            ch[start++] = ch[end];
            ch[end--] = temp;
        }
    }
}