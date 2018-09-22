Time Complexity: O(m * n * 4 ^ k)
m = rows, n = cols (m * n = iterate over whole 2d array)
4 = 4 ways for every character (4 possible directions for every match)
k = length of word to search (max possible for every match)

Space: O(k) = at max, length of search word would be in recursive stack. 

class Solution {
    public boolean exist(char[][] board, String word) {

        for(int row = 0; row < board.length; ++row){
            for(int col = 0; col < board[0].length; ++col){
                if(wordSearch(board, row, col, 0,  word)){
                    return true;        
                }
            }
        }
        return false;
    }
    
    private boolean wordSearch(char board[][], int row, int col, int index, String word){
        if(index == word.length()){
            return true;
        }
        if(row < 0|| row >= board.length || col < 0 || col >= board[0].length || word.charAt(index) != board[row][col]){
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '*';
        boolean result = wordSearch(board, row + 1, col, index + 1, word) || wordSearch(board, row, col + 1, index + 1, word) || wordSearch(board, row - 1, col, index + 1, word) || wordSearch(board, row, col - 1, index + 1, word);
       
        board[row][col] = temp;
        return result;
    }
}