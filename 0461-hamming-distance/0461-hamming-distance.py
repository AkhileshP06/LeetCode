class Solution(object):
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        xor_res = x ^ y
        ham = bin(xor_res).count('1')
        return ham