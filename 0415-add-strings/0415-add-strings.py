class Solution(object):
    def addStrings(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        i = len(num1) - 1
        j = len(num2) - 1

        # Initialize the carry and the result list
        carry = 0
        result = []

        # Loop through the digits from the rightmost to the leftmost
        while i >= 0 or j >= 0 or carry:
            # Get the digit or 0 if the pointer is out of bounds
            n1 = int(num1[i]) if i >= 0 else 0
            n2 = int(num2[j]) if j >= 0 else 0

            # Calculate the sum and the carry
            total = n1 + n2 + carry
            carry = total // 10

            # Append the rightmost digit to the result list
            result.append(str(total % 10))

            # Move the pointers to the left
            i -= 1
            j -= 1

        # Reverse the result and join to form the final string
        return "".join(result[::-1])