class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] prefixSum2D = new int[rows+1][cols+1];
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                prefixSum2D[i][j] = matrix[i-1][j-1]        +
                                    prefixSum2D[i-1][j]     +
                                    prefixSum2D[i][j-1]     -
                                    prefixSum2D[i-1][j-1];
            }
        }
        int count = 0;
        for(int x1 = 1; x1 <= rows; x1++){
            for(int y1 = 1; y1 <= cols; y1++){
                for(int x2 = x1; x2 <= rows; x2++){
                    for(int y2 = y1; y2 <= cols; y2++){
                        int sum =   prefixSum2D[x2][y2]     -
                                    prefixSum2D[x2][y1-1]   -
                                    prefixSum2D[x1-1][y2]   +
                                    prefixSum2D[x1-1][y1-1];
                        if(sum == target) ++count;
                    }
                }
            }
        }
        return count;
        
    }
}