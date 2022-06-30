class Solution {
    public int minMoves2(int[] nums) {
        int sum1 = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int median = 0;
        
        if(n%2 != 0){
            median = nums[n/2];
        }
        else{
            median = nums[(n/2)-1];
        }
        int moves = 0;
        for(int j = 0; j<n; j++){
            moves += Math.abs(median-nums[j]);
        }
        return moves;
    }
}