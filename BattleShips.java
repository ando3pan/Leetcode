class Solution{
  public int countBattleships(char[][] board){
    int numBattleships = 0;
//practice to declare return value early on to update
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board.length; j++){
//we're only interested in encountering x's, so we go through
        if(board[i][j] == 'X'){
          numBattleships++;
          sink(board,i,j);
//our recursive call that we will need to check all of its neighbors
//with specific response to each neighbor type
        }
      }
    }
    return numBattleships;
  }
  public void sink(char[][] board, int i, int j){
    if(i < 0 || i >= board.length || j < 0 || j >= board.lenght || board[i][j] != 'X'){
      return;
    }
//if out of bounds or encounters a non-X, then we do nothing
    board[i][j] = '.';
    sink(board,i+1,j);
    sink(board,i-1,j)
    sink(board,i,j+1);
    sink(board,i,j-1);
//we get rid of the current so it doesnt recurse infinitely, then we do the operations on all neighbors
  }
}
