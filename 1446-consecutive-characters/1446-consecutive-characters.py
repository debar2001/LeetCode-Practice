class Solution(object):
    def maxPower(self, s):
        s = s.lower()
        count1 = 1
        counts = []
        
        for i in range(len(s)):
            if(i != 0):
                if(s[i-1] == s[i]):
                    count1 += 1
                    counts.append(count1)
                else:
                    count1 = 1
                    counts.append(count1)
                    
            else:
                counts.append(count1)
                    
        return (max(counts))
                    
        