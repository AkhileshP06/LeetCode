class Solution(object):
    def countBits(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        ans = [0] * (n + 1)

        # Iterate from 1 to n
        for i in range(1, n + 1):
            # Calculate the number of 1's in the binary representation of i
            ans[i] = ans[i >> 1] + (i & 1)

        return ans