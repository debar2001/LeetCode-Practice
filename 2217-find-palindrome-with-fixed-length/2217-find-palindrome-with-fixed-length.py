class Solution(object):
    def kthPalindrome(self, queries, intLength):
        """
        :type queries: List[int]
        :type intLength: int
        :rtype: List[int]
        """
        output = []
        if (intLength%2 == 0):
            n = (intLength//2) -1
        else:
            n = (intLength//2)
            
        for i in queries:
            x = str(10**n +(i-1))
            
            if (intLength%2 == 0):
                x = x + x[::-1]
            else:
                x = x + x[::-1][1:]
            
            if(len(x) == intLength):
                output.append(int(x))
            else:
                output.append(-1)
                
        return output
#         Brute Force Approach
#         count = 0
#         l = []
#         for i in range(10**(intLength-1), 10**(intLength)):
#             temp = i
#             reversei = 0
#             while(temp != 0):
#                 x = temp%10
#                 reversei = reversei*10 + x
#                 temp = temp//10
                
#             if(reversei == i):
#                 count += 1
#                 l.append(i)
                
#         output = []
#         for j in queries:
#             if(j > count):
#                 output.append(-1)
#             else:
#                 output.append(l[j-1])
                
#         return output