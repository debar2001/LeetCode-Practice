class Solution {
    public int maxSumSubmatrix(int[][] arr, int k) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     ArrayList<Integer> ans1 = new ArrayList<>();
    //     for(int i=0; i<m; i++){
    //         int sum = 0;
    //         for(int j=i; j<n; j++){
    //             sum += matrix[i][j];
    //             ans1.add(sum);
    //         }
    //     }
    //     ArrayList<Integer> ans2 = new ArrayList<>();
    //     for(int i=0; i<ans1.size(); i++){
    //         if(ans1.get(i)<=k){
    //             ans2.add(ans1.get(i));
    //         }
    //     }
    //     int max = -1;
    //     for(int i=0; i<ans2.size(); i++){
    //         max = Math.max(max, ans2.get(i));
    //     }
    //     return max;
    //
        int rows = arr.length;
        int cols = arr[0].length;
        int maxK = Integer.MIN_VALUE;
        for(int i = 0; i < cols; i++){
            int dp[] = new int[rows];
            for(int j = i; j < cols; j++){
                for(int l = 0; l < rows; l++){
                    dp[l] += arr[l][j];
                }
                int currSum = maxSubArray(dp, k);
                maxK = Math.max(maxK, currSum);                 
                if(maxK == k)
                    return k;
            }
        }
        return maxK;
    }
    
    public int maxSubArray(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            Integer ceilValue = set.ceiling(currSum - k);
            if(ceilValue != null) {
                max = Math.max(max, currSum - ceilValue);
            }
            set.add(currSum);
        }
        return max;
    }

    
}