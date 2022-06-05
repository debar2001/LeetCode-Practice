class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int store_i[] = new int[m];
        int store_j[] = new int[n];
        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(matrix[i][j] == 0)
                {
                    store_i[i] = 1;
                    store_j[j] = 1;
                }
            }
        }
    
        for(int i=0; i<store_i.length; i++)
        {
            for(int j=0; j<store_j.length; j++)
            {
                if(store_i[i]==1 || store_j[j]==1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}