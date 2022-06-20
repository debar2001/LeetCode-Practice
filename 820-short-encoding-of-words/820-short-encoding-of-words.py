from collections import deque
class Solution:
    def minimumLengthEncoding(self, words):
        trie = {"level":0} #level keeps track of length of the traversed word
        for word in words:
            curr = trie
            for j in word[::-1]:
                if j not in curr:
                    curr[j] = {}
                    curr[j]["level"] = curr["level"]+1 
                curr = curr[j]
        
        q = deque([trie])
        s = 0
        while q:
            curr = q.popleft()
            for i in curr:
                if i!="level":
                    if len(curr[i])==1:
                        s+=curr[i]["level"] + 1 #Adding 1 for #
                    else:
                        q.append(curr[i])
        return s
        