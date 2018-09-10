Complexity

Time = O(N) N = length of temperature. Since all the temperatures are added and removed only once.
Space = O(N)


class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        if (temperatures.length == 0 || temperatures == null){
            return temperatures;
        }
        int []result = new int[temperatures.length];
        int stack[] = new int[temperatures.length];
        int top = -1;
        
        for(int i = 0; i < temperatures.length; ++i){
            while(top != -1 && temperatures[i] > temperatures[stack[top]]){
                int temp = stack[top--];
                result[temp] = i - temp;
            }
            
            stack[++top] = i;
        }
        return result;
    }
}