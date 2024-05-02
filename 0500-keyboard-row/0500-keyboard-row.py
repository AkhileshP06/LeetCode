class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        row1 = set("qwertyuiop")
        row2 = set("asdfghjkl")
        row3 = set("zxcvbnm")

        # List to store the words that can be typed using one row
        result = []

        # Iterate through each word
        for word in words:
            # Convert the word to lowercase to handle case-insensitive checking
            lower_word = word.lower()

            # Check if the word can be typed using only one row
            if set(lower_word).issubset(row1) or set(lower_word).issubset(row2) or set(lower_word).issubset(row3):
                result.append(word)

        return result