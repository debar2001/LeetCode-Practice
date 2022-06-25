class Solution(object):
    def checkPossibility(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        size = len(nums)
        change = False
        
        for i in range(size-1):
            if nums[i]<=nums[i+1]:
                continue
            if change:
                return False
            if i==0 or nums[i+1] >= nums[i-1]:
                nums[i] = nums[i+1]
            else:
                nums[i+1] = nums[i]
            change = True
            
        return True