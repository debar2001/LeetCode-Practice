class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] prefixsum = new int[n];
        prefixsum[0] = nums[0];
        for(int i=1; i<n; i++){
            prefixsum[i] = prefixsum[i-1]+nums[i];
        }
        return prefixsum;
    }
}