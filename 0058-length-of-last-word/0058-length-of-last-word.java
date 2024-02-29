class Solution 
{
    public int lengthOfLastWord(String s)
    {
        s=s.trim();
        int i=s.lastIndexOf(' ');
        return s.length()-i-1;
    }
}