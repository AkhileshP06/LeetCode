class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0 or (x % 10 == 0 and x != 0) :
            return False
        rev = 0
        org = x
        while org > 0 :
            d = org % 10
            rev = rev * 10 + d
            org = org / 10
        return rev == x
        