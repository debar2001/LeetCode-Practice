class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        int low = 0; int high = n-1;
        
        for(int i=n-1; i>=0; i--){
            if(Math.abs(nums[low])>Math.abs(nums[high])){
                res[i] = nums[low]*nums[low];
                low++;
            }
            else{
                res[i] = nums[high]*nums[high];
                high--;
            }
        }
        return res;
    }
}