class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        phone = {
            '2': ['a', 'b', 'c'],
            '3': ['d', 'e', 'f'],
            '4': ['g', 'h', 'i'],
            '5': ['j', 'k', 'l'],
            '6': ['m', 'n', 'o'],
            '7': ['p', 'q', 'r', 's'],
            '8': ['t', 'u', 'v'],
            '9': ['w', 'x', 'y', 'z']
        }
        
        # If the digits string is empty, return an empty list
        if not digits:
            return []
        
        # Recursive function to generate combinations
        def backtrack(index, path):
            # If we've processed all digits, add the combination to the result
            if index == len(digits):
                result.append("".join(path))
                return
            
            # Get the possible letters for the current digit
            current_digit = digits[index]
            letters = phone[current_digit]
            
            # Iterate over the letters and recurse
            for letter in letters:
                path.append(letter)
                backtrack(index + 1, path)
                path.pop()  # Backtrack to explore other combinations
        
        # Result list to store all combinations
        result = []
        
        # Start the recursion with an empty path and at index 0
        backtrack(0, [])
        
        return result