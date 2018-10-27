
Time : O((3*n^2))//from leetcode
space: O(n), we need temp variable of n size to store row 


First Swap the rows and then transpose the whole matrix

class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i = 0; i < matrix.length/2; ++i){
            int temp[] = matrix[i];
            matrix[i] = matrix[matrix.length -i - 1];
            matrix[matrix.length - i - 1] = temp;
        }
        
        for(int x = 0 ;x < matrix.length;++x){
            for(int y = 0;y < x;++y){
               int temp = matrix[x][y];
                matrix[x][y] = matrix[y][x];
                matrix[y][x] = temp;
            }
        }
    }
}