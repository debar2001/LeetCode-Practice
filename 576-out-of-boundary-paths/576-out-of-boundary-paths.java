class Solution {
    int [] xdir = {-1, 1, 0, 0};
    int [] ydir = {0, 0, -1, 1};
    int rows; 
    int cols;
    int mod = 1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        rows = m;
        cols= n;
        int [][] grid = new int[m][n]; 
        int dp[][][] = new int[m][n][maxMove+1];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k <= maxMove; k++)
                    dp[i][j][k] = -1;
        return dfs(startRow, startColumn, maxMove, dp)%mod;
    }
    
    private int dfs(int x, int y, int maxMove, int[][][] dp){
        int cnt = 0;
        if(maxMove == 0) {
            return 0;
        }
        
        if(dp[x][y][maxMove] != -1) {
            return dp[x][y][maxMove]%mod;
        }
        
        for(int i = 0; i< 4; i++) {
            int xx = x + xdir[i];
            int yy = y+ ydir[i];
            if(xx < 0 || xx >= rows || yy < 0 || yy >= cols){
                cnt++;
                // out of boundry
                continue;
            }
            
            cnt += dfs(xx, yy, maxMove-1, dp)%mod;
            cnt = cnt%mod;
        }
        return dp[x][y][maxMove] = cnt%mod;
    }
}