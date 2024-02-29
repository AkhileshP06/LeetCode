class Solution
{
    public char repeatedCharacter(String s)
    {
        int index =0;
        int minIndex =Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    index =j;
                    break;
                }
            }
            if(index<minIndex && index>0)
            { 
                minIndex=index;
            }
         }
        if(minIndex>0)
        {  
            return s.charAt(minIndex);
        }
        return s.charAt(0); 
    }
}
