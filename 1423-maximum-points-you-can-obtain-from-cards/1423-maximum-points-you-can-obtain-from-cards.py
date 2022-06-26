class Solution(object):
    def maxScore(self, cardPoints, k):
        """
        :type cardPoints: List[int]
        :type k: int
        :rtype: int
        """
        size = len(cardPoints)
        if (k==size):
            return sum(cardPoints)
        else:
            suml = 0
            sumr = 0
            l = 0
            r = size-1
            lp = []
            rp = []
            while(l<size):
                suml += cardPoints[l]
                lp.append(suml)
                l+=1
                
            while(r>=0):
                sumr += cardPoints[r]
                rp.append(sumr)
                r-=1
            ans = max(lp[k-1], rp[k-1])
            for i in range(k-1):
                ans = max(ans, lp[i]+rp[k-i-2])
            return ans
            
            