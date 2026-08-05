class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        return checkRows(board) && checkColumns(board) && checkSquares(board);
    }

    public boolean checkRows(char[][] board){
        for(int i = 0; i < 9; i++){

            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                else if(!set.add(board[i][j])){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkColumns(char[][] board){

        for(int i = 0; i < 9; i++){

            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                else if(!set.add(board[j][i])){
                    return false;
                }
            }
        }
        return true;
    }


    public boolean checkSquares(char[][] board){

        for(int i = 0; i < 9; i++){
            HashSet<Character> set = new HashSet<>();

            int startRow = (i / 3) * 3;
            int startCol = (i % 3) * 3;

            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    if(board[startRow + j][startCol + k] == '.'){
                        continue;
                    }
                    else if(!set.add(board[startRow + j][startCol + k])){
                        return false;
                    }           
                }
            }
        }
        return true;
    }
}
