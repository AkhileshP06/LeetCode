class Solution
{
    public int strStr(String haystack, String needle)
    {
        if(needle.length()==0)
            return 0;
        haystack = haystack.replace(needle,"1");
        for(int i = 0 ; i<haystack.length(); i++)
        {
            if(haystack.charAt(i)=='1')
            {
                return i;
            }
        }
        return -1;
    }
}