class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        sum1 = 0
        sums = []
        for i in range(len(nums)):
            if(nums[i] == 0):
                sum1 = 0
                sums.append(sum1)
            else:
                sum1 += nums[i]
                sums.append(sum1)
                
        return (max(sums))
        