class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        s = list(s)

        # Define the set of vowels
        vowels = set('aeiouAEIOU')

        # Initialize two pointers at the start and end of the string
        left, right = 0, len(s) - 1

        # Continue until the two pointers meet
        while left < right:
            # Move the left pointer to the right until it points to a vowel
            while left < right and s[left] not in vowels:
                left += 1

            # Move the right pointer to the left until it points to a vowel
            while left < right and s[right] not in vowels:
                right -= 1

            # Swap the vowels at the left and right pointers
            s[left], s[right] = s[right], s[left]

            # Move the pointers inward
            left += 1
            right -= 1

        # Convert the list back to a string and return
        return ''.join(s)