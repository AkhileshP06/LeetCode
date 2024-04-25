class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        sign = -1 if x < 0 else 1
        
        # Reverse the digits, ignoring the sign
        reversed_str = str(abs(x))[::-1]
        
        # Convert the reversed string back to an integer with the correct sign
        reversed_int = sign * int(reversed_str)
        
        # Check for 32-bit integer overflow
        if reversed_int < -2**31 or reversed_int > 2**31 - 1:
            return 0
        
        return reversed_int