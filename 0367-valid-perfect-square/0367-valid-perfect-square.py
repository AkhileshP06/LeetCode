class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num == 1:
            return True
    
        # Iterate through all possible integers up to the square root of num
        for i in range(1, int(num ** 0.5) + 1):
            # Check if the square of the current integer equals num
            if i * i == num:
                return True

        # If no perfect square is found, return False
        return False