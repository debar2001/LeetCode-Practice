class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] psum = new int[n];
        int[] ssum = new int[n];
        psum[0] = nums[0];
        ssum[n-1] = nums[n-1];
        for (int i=1; i<n; i++){
            psum[i] = psum[i-1] + nums[i];
        }
        for (int j=(n-2); j>=0; j--){
            ssum[j] = ssum[j+1] + nums[j];
        }
        for (int k=0; k<n; k++){
            if(psum[k]==ssum[k]){
                return k;
            }
        }
        // for(int i=0; i<n; i++){
        //     System.out.println(psum[i]+" "+ssum[i]);
        // }
        return -1;
    }
}