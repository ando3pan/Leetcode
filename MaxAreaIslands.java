class Solution{
  public int maxAreaOfIslands(int[][] grid){
    int max = 0;
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[i].length, j++){
        if(grid[i][j] == 1){
          max = Math.max(max,dfs(grid,i,j))
        }
      }
    }
    return max;
  }
  public int dfs(int[][] grid, int i, int j){
    if(i < 0 || i >= grid.length || j < 0 || j >= grid.length || board[i][j] != 1){
      return 0;
    }
    grid[i][j] = 0;
    int count = 1;
    dfs(board,i+1,j);
    dfs(board,i-1,j);
    dfs(board,i,j+1);
    dfs(board,i,j-1);
    return count;
  }
}
