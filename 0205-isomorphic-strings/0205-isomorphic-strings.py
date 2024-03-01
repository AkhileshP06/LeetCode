class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
    
        char_map_s = {}
        char_map_t = {}

        for char_s, char_t in zip(s, t):
            if char_s not in char_map_s:
                char_map_s[char_s] = char_t
            else:
                if char_map_s[char_s] != char_t:
                    return False

            if char_t not in char_map_t:
                char_map_t[char_t] = char_s
            else:
                if char_map_t[char_t] != char_s:
                    return False

        return True