class Solution 
{
    public int romanToInt(String s) 
    {
        Map<Character,Integer> romanValues = new HashMap<>();
        romanValues.put('I',1);
        romanValues.put('V',5);
        romanValues.put('X',10);
        romanValues.put('L',50);
        romanValues.put('C',100);
        romanValues.put('D',500);
        romanValues.put('M',1000);
        int  res = 0,prevValue = 0;
        for(int i = s.length()-1;i>=0;i--)
        {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);
            if(currentValue<prevValue)
            {
                res -= currentValue;
            }
            else
            {
                res += currentValue;
            }
            prevValue  = currentValue;
        }
        return res;
    }
}