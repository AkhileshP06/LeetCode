class Solution {
    private String transformString(String s)
    {
        StringBuilder sb = new StringBuilder();
        sb.append('#');

        for(char c : s.toCharArray())
        {
            sb.append(c);
            sb.append('#');
        }
        return sb.toString();

    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        // Step 1: Transform the string to add boundaries to handle even-length palindromes
        String transformedString = transformString(s);
        int n = transformedString.length();
        int[] p = new int[n]; // Array to store the length of palindromes centered at each position
        int center = 0, right = 0; // Current center and the right edge of the palindrome

        int maxLen = 0, centerIndex = 0; // Length and center of the longest palindromic substring

        for (int i = 0; i < n; i++) {
            // Mirror position of i with respect to current center
            int mirror = 2 * center - i;

            // If i is within the right boundary, use the mirror's value
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Try expanding around center i
            while (i + 1 + p[i] < n && i - 1 - p[i] >= 0 &&
                   transformedString.charAt(i + 1 + p[i]) == transformedString.charAt(i - 1 - p[i])) {
                p[i]++;
            }

            // Update the center and right edge if the palindrome expands past the right edge
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            // Track the maximum length palindrome
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        // Find the starting index of the longest palindrome in the original string
        int start = (centerIndex - maxLen) / 2;

        return s.substring(start, start + maxLen);
    }
}