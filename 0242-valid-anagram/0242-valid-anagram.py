class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
        if len(s) != len(t):
            return False
    
    # Create dictionaries to store character counts for both strings
        count_s = {}
        count_t = {}
    
    # Count occurrences of characters in string s
        for char in s:
            count_s[char] = count_s.get(char, 0) + 1
    
    # Count occurrences of characters in string t
        for char in t:
            count_t[char] = count_t.get(char, 0) + 1
    
    # Check if the dictionaries are equal
        return count_s == count_t