class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        max_reachable_index = 0
    
        for i in range(len(nums)):
            if i > max_reachable_index:
                return False
            max_reachable_index = max(max_reachable_index, i + nums[i])
            if max_reachable_index >= len(nums) - 1:
                return True
        
        return max_reachable_index >= len(nums) - 1

        
