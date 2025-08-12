class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n = grid[0].length;
        int[][]visited = new int[m][n];
        for(int i=0;i<m;i++){
            if(grid[i][0]==1 && visited[i][0]==0){
                dfs(i,0,visited,grid);
            }
            if(grid[i][n-1] ==1 && visited[i][n-1]==0){
                dfs(i,n-1,visited,grid);
            }
        }
        for(int j=0;j<n;j++){
            if(grid[0][j]==1 && visited[0][j]==0){
                dfs(0,j,visited,grid);
            }
            if(grid[m-1][j] ==1 && visited[m-1][j]==0){
                dfs(m-1,j,visited,grid);
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]== 1 && visited[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int row,int col,int[][]visited,int[][]board){
        int m = board.length;
        int n =board[0].length;
        visited[row][col]=1;
        int[]drow ={-1,0,1,0};
        int[]dcol={0,1,0,-1};
        for(int i=0;i<4;i++){
            int nrow = row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && board[nrow][ncol]==1&& visited[nrow][ncol]==0){
                dfs(nrow,ncol,visited,board);
            }
        }
    }
}