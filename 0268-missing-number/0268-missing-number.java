class Solution 
{
    public int missingNumber(int[] nums) 
    {
        boolean[] found = new boolean[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
        found[nums[i]] = true;
    }
    for (int i = 0; i < found.length; i++) {
        if (!found[i]) {
            return i;
        }
    }
    return -1; // not found
    }
}