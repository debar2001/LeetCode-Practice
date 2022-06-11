class Solution(object):
    def minOperations(self, nums, x):
        """
        :type nums: List[int]
        :type x: int
        :rtype: int
        """
        dp1 = [0]
        z = 0
        
        for n in nums:
            z += n
            dp1.append(z)
            
        lookup = {v:i for i,v in enumerate(dp1)}
        
        y = sum(nums) - x
        ans = -1
        
        for l_val, l_idx in lookup.items():
            if l_val + y in lookup:
                ans = max(lookup[l_val+y]-l_idx, ans)
                
        if ans == -1:
            return ans
        else:
            return len(nums)-ans