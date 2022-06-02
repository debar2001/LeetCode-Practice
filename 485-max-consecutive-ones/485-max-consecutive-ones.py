class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        count1 = 0
        counts = []
        for i in range(len(nums)):
            if(nums[i] == 0):
                count1 = 0
                counts.append(count1)
            else:
                count1 += 1
                counts.append(count1)
                
        return (max(counts))
        