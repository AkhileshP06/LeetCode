class Solution
{
    public int findNumbers(int[] nums) 
    {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nod(nums[i])%2==0)
            {
                res++;
            }
        }
        return res;
    }
    public int nod(int n)
    {
        int res=0;
        while(n!=0)
        {
            n/=10;
            res++;
        }
        return res;
    }
}