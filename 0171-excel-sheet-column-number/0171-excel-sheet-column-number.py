class Solution(object):
    def titleToNumber(self, columnTitle):
        """
        :type columnTitle: str
        :rtype: int
        """
        result = 0
        for i in range(len(columnTitle)):
            char_value = ord(columnTitle[-(i + 1)]) - ord('A') + 1
            result += char_value * (26 ** i)
        return result
        