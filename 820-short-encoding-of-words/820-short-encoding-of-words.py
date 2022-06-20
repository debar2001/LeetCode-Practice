class Solution:
    def minimumLengthEncoding(self, words: List[str]) -> int: 
        l=[]
        l2=[]
        for i in range(len(words)): #sorting the words array in descending order of words[i]'s length and stored at l2 or you can use words.sort(key=len)
            l.append(len(words[i]))
        l3=l.copy()
        l.sort()
        l=l[::-1]
        for i in range(len(words)):
            new=l3.index(l[i])
            l2.append(words[new])
            l3[new]=0
        print(l2)
        s=""
        s=s+l2[0]+"#"
        for i in range(1,len(l2)):
            st=l2[i]+"#" 
            if st not in s:
                s=s+st
        print(s)
        return len(s)
        