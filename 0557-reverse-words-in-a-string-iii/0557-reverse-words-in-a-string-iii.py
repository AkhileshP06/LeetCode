class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        words = s.split()
    
        # Reverse each word and join them back with whitespace
        reversed_words = [word[::-1] for word in words]
        return ' '.join(reversed_words)