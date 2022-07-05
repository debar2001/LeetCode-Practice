class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs=new HashSet<>();
        
        for(int s:nums)
            hs.add(s);
        
        int n=nums.length;
        
        if(n==0)
            return 0;
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
           int temp1=nums[i];
           int temp2=nums[i];
            int res=1;
            
            while(hs.contains(temp1+1))
            {
                res+=1;
                hs.remove(temp1);
                temp1+=1;
            }
            
            while(hs.contains(temp2-1))
            {
                res+=1;
                hs.remove(temp2);
                temp2-=1;
            }
            
            max=Math.max(max,res);
        }
        
        return max;
    }
}