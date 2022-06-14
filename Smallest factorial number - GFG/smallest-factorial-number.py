#User function Template for python3

class Solution:
    def zero_count(self, x):
        num = 5
        zeros = 0
        while(x>=num):
            zeros+=(x//num)
            num *= 5
        return zeros
    
    def findNum(self, n : int):
        # Complete this function
        low = 0
        high = n*5
        sol = 0
        while(low<=high):
            mid = low + ((high - low)//2)
            zeros = self.zero_count(mid)
            if(zeros >= n):
                sol = mid
                high = mid-1
            else:
                low = mid+1
        
        return sol
#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    
    for _ in range(t):
        n = int(input())
        ob = Solution()
        print(ob.findNum(n))
# } Driver Code Ends