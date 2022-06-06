#User function Template for python3

class Solution:
    def countKdivPairs(self, arr, n, k):
        #code here
        freq = [0] * k
      
        
        for i in range(n):
            freq[arr[i] % k]+= 1
              
        
        sum = freq[0] * (freq[0] - 1) / 2;
          
        
        i = 1
        while(i <= k//2 and i != (k - i) ):
            sum += freq[i] * freq[k-i]
            i+= 1
      
        
        if( k % 2 == 0 ):
            sum += (freq[k//2] * (freq[k//2]-1)/2);
          
        return int(sum)
#{ 
#  Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        n = int(input())
        a = list(map(int,input().strip().split()))
        k = int(input())
        ob= Solution()
        print(ob.countKdivPairs(a,n,k))
# } Driver Code Ends