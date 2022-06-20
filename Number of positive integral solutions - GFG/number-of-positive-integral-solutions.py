#User function Template for python3
import math
class Solution:
    def posIntSol(self,s):
        #code here
        test = s.split('=')
        variables = len(test[0].strip().split('+'))
        total = int(test[1].strip())
        
        if variables > total:
            return 0
            
        else:
            x = math.factorial(total-1)
            y = math.factorial(variables-1)
            z = math.factorial(total-variables)
            
            return (x//(y*z))
#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        s = input()

        solObj = Solution()

        print(solObj.posIntSol(s))
# } Driver Code Ends