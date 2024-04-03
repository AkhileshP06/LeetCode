class Solution(object):
    def arrangeCoins(self, n):
        """
        :type n: int
        :rtype: int
        """
        left, right = 0, n
        while left <= right:
            k = (left + right) // 2
            curr = k * (k + 1) // 2
            if curr == n:
                return k
            elif curr < n:
                left = k + 1
            else:
                right = k - 1
        return right
        