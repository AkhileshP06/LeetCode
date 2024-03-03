class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        num_index_map = {}

        for i, num in enumerate(nums):
            if num in num_index_map and abs(i - num_index_map[num]) <= k:
                return True
            num_index_map[num] = i

        return False
        