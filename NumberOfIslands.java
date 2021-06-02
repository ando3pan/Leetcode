class Solution{
  public int numIslands(char[][]grid){
    if(grid == null || grid.length == 0){
      return 0;
    }
    int numIslands = 0;
    for (int i = 0; i < grid.length();i++){
      for (int j = 0; j < grid[i].length;j++){
        if(grid[i][j] == '1'){
          numIslands += dfs(grid,i,j);
        }
      }
    }
  }
  public int dfs(char[][] grid, int i, int j){
    if( i < 0 || i>= grid.length || j < 0 || j>= grid.length || grid[i][j] == '0'){
      return 0;
    }
//check edge cases of invalds/nulls
    grid[i][j] = '0';
//to prevent cases of endless loops
    dfs(grid, i+1,j);
    dfs(grid, i-1,j);
    dfs(grid, i,j+1);
    dfs(grid, i,j-1);
//check positional parameters
    return 1;

  }
}
