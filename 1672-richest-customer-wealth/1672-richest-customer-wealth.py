class Solution(object):
    def maximumWealth(self, accounts):
        max1 = 0
        for i in range(len(accounts)):
            sum1 = 0
            for j in range(len(accounts[i])):
                sum1 += accounts[i][j]
                if(sum1 > max1):
                    max1 = sum1
        return max1
        
        