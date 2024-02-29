import java.util.*;
import java.lang.Math;
class Solution
{
    public List <Integer> findDisappearedNumbers(int[] a)
    {
        int idx;
        for(int i = 0 ; i < a.length ; i++)
        {
            idx = Math.abs(a[i]) - 1;
            if(a[idx] > 0)
                a[idx] *= -1;
        }
        List <Integer> result = new ArrayList <Integer> ();
        for(int i = 0 ; i < a.length ; i++)
            if(a[i] > 0)
                result.add(i + 1);
        return result;
    }
}