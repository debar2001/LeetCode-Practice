class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        m = []
        l = 0
        r = len(numbers) - 1
        
        while(l<r):
            if((numbers[l] + numbers[r]) > target):
                r -= 1
            elif((numbers[l] + numbers[r]) < target):
                l += 1
            else:
                m.append(l+1)
                m.append(r+1)
                return m
        
                    
    
                    