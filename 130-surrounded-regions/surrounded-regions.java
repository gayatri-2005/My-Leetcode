class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n = board[0].length;
        int[][]visited = new int[m][n];
        for(int i=0;i<m;i++){
            if(board[i][0]=='O' && visited[i][0]==0){
                dfs(i,0,visited,board);
            }
            if(board[i][n-1] =='O' && visited[i][n-1]==0){
                dfs(i,n-1,visited,board);
            }
        }
        for(int j=0;j<n;j++){
            if(board[0][j]=='O' && visited[0][j]==0){
                dfs(0,j,visited,board);
            }
            if(board[m-1][j] =='O' && visited[m-1][j]==0){
                dfs(m-1,j,visited,board);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && visited[i][j]==0){
                    board[i][j]='X';
                }
            }
        }
        
    }
    public void dfs(int row,int col,int[][]visited,char[][]board){
        int m = board.length;
        int n =board[0].length;
        visited[row][col]=1;
        int[]drow ={-1,0,1,0};
        int[]dcol={0,1,0,-1};
        for(int i=0;i<4;i++){
            int nrow = row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && board[nrow][ncol]=='O'&& visited[nrow][ncol]==0){
                dfs(nrow,ncol,visited,board);
            }
        }
    }
}