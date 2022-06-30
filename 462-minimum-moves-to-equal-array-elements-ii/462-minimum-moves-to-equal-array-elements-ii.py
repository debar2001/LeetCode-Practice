class Solution(object):
    def minMoves2(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        n = len(nums)
        median = 0
        moves = 0
        if(n%2!=0):
            median = nums[n//2]
        else:
            median = nums[(n//2)-1]
        for i in range(n):
            moves += abs(median-nums[i])
        return moves