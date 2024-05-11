class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        if word.isupper():
            return True
    
        # Check if all characters are lowercase
        if word.islower():
            return True

        # Check if only the first character is uppercase
        if word[0].isupper() and word[1:].islower():
            return True

        return False
