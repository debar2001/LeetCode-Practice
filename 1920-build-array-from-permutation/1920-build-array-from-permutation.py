class Solution(object):
    def buildArray(self, nums):
        l = []
        for i in range(len(nums)):
            l.append(nums[nums[i]])
            
        return l
        