#User function Template for python3

class Solution:
    def changeBits(self, N):
        # code here
        x = bin(N)
        y = str(x)
        y = y[2:]
        ans = [((2**(len(y))-1)-N), ((2**(len(y))-1))]
        return ans
        

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        
        ob = Solution()
        ans = ob.changeBits(N)
        
        print(ans[0],ans[1])
# } Driver Code Ends