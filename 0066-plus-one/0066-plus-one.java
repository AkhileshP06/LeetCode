class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        return increment(digits, digits.length-1);
    }

    private int[] expand(int[] nums) 
    {
        int[] expandedArray = new int[nums.length+1];
        expandedArray[0] = 1;
        return expandedArray;
    }

    private int[] increment(int[] nums, int i) 
    { 
        if (nums[i]+1 < 10) 
        { 
            nums[i] += 1;
            return nums;
        }
        else if (i == 0 && nums[i] == 9)
        { 
            return expand(nums);
        }
        else
        {
            nums[i] = 0;
            return increment(nums, i-1);
        }
    }
}