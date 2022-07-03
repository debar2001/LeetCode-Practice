class Solution {
    public int wiggleMaxLength(int[] nums) {
        int count=0;
        int prev=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]>0 && prev>0)
                count++;
            if(nums[i]-nums[i-1]<0 && prev<0)
                count++;
            if(nums[i]==nums[i-1]){
                count++;
                continue;
            }
            prev=nums[i]-nums[i-1];
        }
        return(nums.length-count);

    }
}