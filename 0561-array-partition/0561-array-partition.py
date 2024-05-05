class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()

        # Sum the elements at even indices
        sum_min = sum(nums[i] for i in range(0, len(nums), 2))

        return sum_min