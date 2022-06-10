class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        list_ = list(s)
        dict_ = {}
        count = 0
        countMax = 0
        i = 0
        while(i<len(s)):
            temp = ord(s[i])
            if(temp not in dict_):
                dict_[temp] = i
                count+=1
                #print(dict_)
            
            else:
                i = dict_[temp]
                dict_.clear()
                countMax = max(count,countMax)
                count = 0
            i+=1
        return max(countMax,count)
#         l = []
#         s = list(s)
#         n = len(s)
#         m = [ord(s[0])]
        
        
#         for i in range(1, n):
#             j = (len(m)-1)
#             while(ord(s[i]) != m[j] and j >=0):
#                 j -= 1
#             if(j == -1):
#                 m.append(ord(s[i]))
#             else:
#                 x = len(m)
#                 l.append(x)
#                 m =[]
#                 m.append(ord(s[i]))
                    
#         return(max(l))
                    
        