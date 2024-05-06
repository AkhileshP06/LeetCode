class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        def expandAroundCenter(left, right):
        # Expand as long as characters are the same and within the bounds of the string
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
            # Return the length of the palindrome found
            return right - left - 1

        start = 0
        max_length = 0

        # Loop through the string to consider each character as the center
        for i in range(len(s)):
            # Odd-length palindrome
            len1 = expandAroundCenter(i, i)
            # Even-length palindrome
            len2 = expandAroundCenter(i, i + 1)

            # Get the maximum length palindrome found
            current_max = max(len1, len2)

            # Update the starting index and maximum length if a longer palindrome is found
            if current_max > max_length:
                max_length = current_max
                # Set the start to the left index of the longest palindrome
                start = i - (current_max - 1) // 2

        # Return the longest palindrome substring
        return s[start:start + max_length]    