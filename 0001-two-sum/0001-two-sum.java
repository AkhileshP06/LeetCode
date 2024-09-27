class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int res[] = new int[2];
        int x,y;
        for(int i = 0;i<nums.length;i++)
        {
            x = nums[i];
            for(int j = i+1;j<nums.length;j++)
            {
                y = nums[j];
                if(x+y==target)
                {
                    res[0] = i;
                    res[1] = j;
                }
                else
                continue;
            }

        }
        return res;
        
    }
}