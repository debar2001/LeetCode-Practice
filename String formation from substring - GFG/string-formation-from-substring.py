#User function Template for python3
class Solution:
	def isRepeat(self, s):
		# code here
		sub = ""
		count = 0
		n = len(s)
		
		for i in s:
		   sub += i
		   count += 1
		   l = n//count
		    
		   if ((l>1) and (s==sub*l)):
		       return 1
	    return 0

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		s = input()
		
		ob = Solution()	
		answer = ob.isRepeat(s)
		
		print(answer)


# } Driver Code Ends