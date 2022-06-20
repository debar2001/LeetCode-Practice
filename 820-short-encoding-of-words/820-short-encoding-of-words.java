class Solution:
    def minimumLengthEncoding(self, words: List[str]) -> int:
        word_set = set(words)
         
        for word in words:
            n = len(word)
            for j in range(n-1):
                if word[n-j-1:] in word_set and word[n-j-1:]!= word:
                    word_set.remove(word[n-1-j:])
        return sum([len(i)+1 for i in word_set]) #1 is added for #
        