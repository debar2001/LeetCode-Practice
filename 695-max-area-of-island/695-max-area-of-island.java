class Solution {
    int[][] directions = {{-1, 0}, {1, 0}, {0, - 1}, {0, 1}};
    
    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        
        int[][] visited = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && visited[i][j] == 0) {
                    result = Math.max(result, dfs(grid, i, j, visited));
                }
            }
        }
        return result;
    }
    
     public int dfs(int[][] grid, int x, int y, int[][] visited) {
        if (x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1 || grid[x][y] == 0 || visited[x][y] == 1)         {
            return 0;
        }
        
        visited[x][y] = 1;
        
        int surroundingCount = 0;
        
        for (int[] dir: directions) {
            surroundingCount += dfs(grid, x + dir[0], y + dir[1], visited);
        }
        
        return 1 + surroundingCount;
    }
}