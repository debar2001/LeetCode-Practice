class Solution(object):
    def maximumUniqueSubarray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        seen = {} 
        mx, output = 0, 0
        l = 0
        for i, n in enumerate(nums):
            if n in seen:
                while l<seen[n]+1:
                    mx -= nums[l]
                    l += 1
            
            seen[n] = i
            mx += n
            output = max(mx, output)
            
        return output