class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        rs = sum(nums)
        ls = 0
        for i in range(len(nums)):
            rs = rs-nums[i]
            if(ls==rs):
                return i
            ls = ls+nums[i]
        return -1
        