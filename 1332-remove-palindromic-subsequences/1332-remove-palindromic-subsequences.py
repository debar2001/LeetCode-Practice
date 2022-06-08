class Solution(object):
    def removePalindromeSub(self, s):
        """
        :type s: str
        :rtype: int
        """
        n = len(s)
        
        i = 0
        j = n-1
            
        while(i < j):
            if(s[i] != s[j]):
                return 2
            else:
                i += 1
                j -= 1
            
        return 1