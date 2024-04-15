class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s_pointer, t_pointer = 0, 0
    
        # Iterate through both strings
        while s_pointer < len(s) and t_pointer < len(t):
            # If characters match, move s_pointer to the next character
            if s[s_pointer] == t[t_pointer]:
                s_pointer += 1
            # Move t_pointer to the next character in any case
            t_pointer += 1

        # If s_pointer reached the end of s, it means s is a subsequence of t
        return s_pointer == len(s)