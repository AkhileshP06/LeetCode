class Solution {
    public void reverseString(char[] s) {
        char rev[] = new char[s.length];
        for (int i = s.length-1;i>=0;i--)
        {
            rev[(s.length-1) -i] = s[i];
        }
        for(int i = 0;i<s.length;i++)
        {
            s[i] = rev[i];
        }
    }
}