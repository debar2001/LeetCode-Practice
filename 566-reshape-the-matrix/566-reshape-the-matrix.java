class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        if(m*n != r*c) return mat;
        
        int[][] ans = new int[r][c];
        
        int ans_rows = 0;
        int ans_cols = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[ans_rows][ans_cols] = mat[i][j];
                ans_cols++;
                if(ans_cols==c){
                    ans_cols = 0;
                    ans_rows++;
                }
            }
        }
        return ans;
    }
}