class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s.lstrip()
        pattern = r"^[\-+]?\d+"
        match = re.search(pattern, s)
        if not match:
            return 0
        else:
            result = re.findall(pattern, s)
            result2 = int(result[0])
            if result2 < (-2 ** 31):
                return -2 ** 31
            elif result2 > (2 ** 31 -1):
                return 2 ** 31 -1
            else:
                return result2