class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        l = []
        
        for i in range(len(nums)):
            if(i != len(nums)-1):
                for j in range(i+1, len(nums)):
                    if(nums[i] + nums[j] == target):
                        l.append(i)
                        l.append(j)
                        break
                        
        return l
                    
                        
        