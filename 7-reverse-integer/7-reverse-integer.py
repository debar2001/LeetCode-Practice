class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        temp = []
        if x < 0:
            sign = -1
        else:
            sign = 1
            
        x = abs(x)
        while x:
            temp.append(x%10)
            x = x//10
            
        temp = temp[::-1]
        res = 0
        for i in range(len(temp)):
            res+=temp[i]*pow(10,i)
        
        res = res*sign
        
        if (res > (pow(2,31)-1)) or (res < pow(-2,31)):
            return 0
        else:
            return res