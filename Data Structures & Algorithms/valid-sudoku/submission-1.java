class Solution {
    public boolean checkCube(char[][] board,int a,int b){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=a;i<a+3;i++){
        for(int j=b;j<b+3;j++){
            if(board[i][j] == '.'){
                continue;
            }
            if(hs.contains(Character.getNumericValue(board[i][j]))){
              return false;
                }
            else{
                hs.add(Character.getNumericValue(board[i][j]));
                }
            }  
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
      for(int i=0;i<9;i++){
        HashSet<Integer>  a  = new HashSet<>();
        for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(a.contains(Character.getNumericValue(board[i][j]))){
                    return false;
                }
                else{
                    a.add(Character.getNumericValue(board[i][j]));
                }
        }
      }
      for(int i=0;i<9;i++){
        HashSet<Integer>  a  = new HashSet<>();
        for(int j=0;j<9;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if(a.contains(Character.getNumericValue(board[j][i]))){
                    return false;
                }
                else{
                    a.add(Character.getNumericValue(board[j][i]));
                }
        }
      }
      for(int i = 0; i < 9; i += 3) {
    for(int j = 0; j < 9; j += 3) {
        if(!checkCube(board, i, j)) {
            return false;
        }
    }
}

    return true;
    }
}
