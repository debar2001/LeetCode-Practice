class Solution(object):
    def runningSum(self, nums):
        l = []
        for i in range(len(nums)):
            sum = 0
            for j in range(i+1):
                sum += nums[j]
            l.append(sum)
            
        return l