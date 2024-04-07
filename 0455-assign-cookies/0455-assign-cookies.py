class Solution(object):
    def findContentChildren(self, g, s):
        """
        :type g: List[int]
        :type s: List[int]
        :rtype: int
        """
        g.sort()
        s.sort()

        # Initialize variables to track the indices of children and cookies
        i, j = 0, 0
        content_children = 0

        # Iterate through the arrays
        while i < len(g) and j < len(s):
            # If the current cookie can satisfy the greed factor of the current child
            if s[j] >= g[i]:
                # Increment the count of content children
                content_children += 1
                # Move to the next child and cookie
                i += 1
            # Move to the next cookie
            j += 1

        return content_children