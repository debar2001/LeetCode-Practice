class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        x = str(x)
        left = 0
        right = len(x) - 1
        
        while(left < right):
            if(x[left] == x[right]):
                left += 1
                right -= 1
            else:
                return False
        return True
        