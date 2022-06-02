class Solution(object):
    def maximumWealth(self, accounts):
        sums = []
        for i in range(len(accounts)):
            sum1 = 0
            for j in range(len(accounts[i])):
                sum1 += accounts[i][j]
                sums.append(sum1)
        
        return(max(sums))
        