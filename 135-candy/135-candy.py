class Solution(object):
    def candy(self, ratings):
        """
        :type ratings: List[int]
        :rtype: int
        """
        n = len(ratings)
        l = [1 for i in range(n)]
        r = [1 for j in range(n)]
        candies = 0
        for k in range(1, n, 1):
            if(ratings[k] > ratings[k-1]):
                l[k] = l[k-1] + 1
        
        for m in range(n-2, -1, -1):
            if(ratings[m] > ratings[m+1]):
                r[m] = r[m+1] + 1
                
        for x in range(n):
            candies = candies + max(l[x], r[x])
            
        return candies