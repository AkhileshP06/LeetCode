class Solution(object):
    def licenseKeyFormatting(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        s = s.replace('-', '').upper()

        # Calculate the length of the first group
        first_group_size = len(s) % k
        if first_group_size == 0:
            first_group_size = k

        # Build the reformatted license key
        result = s[:first_group_size]  # Add the first group
        # Iterate through the rest of the string in groups of size `k`
        for i in range(first_group_size, len(s), k):
            result += '-' + s[i:i + k]

        return result