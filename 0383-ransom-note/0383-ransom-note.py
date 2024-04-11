class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        magazine_freq = defaultdict(int)
        for char in magazine:
            magazine_freq[char] += 1

        # Iterate through the characters in the ransomNote and decrement their frequencies
        for char in ransomNote:
            if magazine_freq[char] <= 0:
                return False
            magazine_freq[char] -= 1

        return True