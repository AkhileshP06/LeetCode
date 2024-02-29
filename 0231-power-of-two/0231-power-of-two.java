class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
        if (n <= 0) {
        return false; // Negative numbers and zero cannot be powers of two
    }

    // Use bitwise AND operation to check if there is only one set bit
    return (n & (n - 1)) == 0;
    }
}