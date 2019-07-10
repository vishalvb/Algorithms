

Time:O(1) as there are 2^32 number of valid ip address, irrespective of input string

class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        LinkedList<String> result = new LinkedList<>();
        if(s == null || s.length() ==0){
            return result;
        }
        int len = s.length();
        for(int i = 0 ; i < 4 && i < len - 2; ++i){
            for(int j = i + 1; j < i + 4 && j < len -1; ++j){
                for(int k = j + 1; k < j + 4 && k < len; ++k){
                    String first = s.substring(0, i);
                    String second = s.substring(i, j);
                    String third = s.substring(j, k);
                    String fourth = s.substring(k);
                    if(isvalid(first) && isvalid(second) && isvalid(third) && isvalid(fourth)){
                        result.add(first+"."+second+"."+third+"." +fourth);
                    }
                }
            }
        }
        
        return result;
    }
    
    
    private boolean isvalid(String s){
        if(s.length() == 0 || s.length() > 3 || s.charAt(0) == '0' && s.length() > 1 ||
          Integer.parseInt(s) > 255){
            return false;
        }
        
        
        return true;
    }
    
}