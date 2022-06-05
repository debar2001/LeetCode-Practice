class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int store_row[] = new int[m];
        int store_col[] = new int[n];
        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(matrix[i][j] == 0)
                {
                    store_row[i] = 1;
                    store_col[j] = 1;
                }
            }
        }
    
        for(int i=0; i<store_row.length; i++)
        {
            for(int j=0; j<store_col.length; j++)
            {
                if(store_row[i]==1 || store_col[j]==1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}