class Solution(object):
    def findComplement(self, num):
        """
        :type num: int
        :rtype: int
        """
        bit_length = num.bit_length()

        # Create a bitmask with all bits set to 1 of the same length as num
        # Example: if num is 5 ("101"), the bitmask will be "111"
        bitmask = (1 << bit_length) - 1

        # XOR with the bitmask to flip all bits and get the complement
        complement = num ^ bitmask

        return complement
