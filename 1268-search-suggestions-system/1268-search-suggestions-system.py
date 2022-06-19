class Solution(object):
    def suggestedProducts(self, products, searchWord):
        """
        :type products: List[str]
        :type searchWord: str
        :rtype: List[List[str]]
        """
        products.sort()
        left, right = 0, len(products) - 1
        res = []
        
        for i, c in enumerate(searchWord):
            while left <= right and (len(products[left]) <= i or products[left][i] != c):
                left += 1
            while left <= right and (len(products[right]) <= i or products[right][i] != c):
                right -= 1

            res.append([products[left + j] for j in range(min(3, right - left + 1))])
        
        return res
        