class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        result = []

        # Iterate over the array to fix the first element of the triplet
        for i in range(len(nums) - 2):
            # Avoid duplicates by skipping same elements
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            # Two-pointer technique to find the other two elements
            left = i + 1
            right = len(nums) - 1

            while left < right:
                current_sum = nums[i] + nums[left] + nums[right]

                if current_sum == 0:
                    # Found a triplet that sums to zero
                    result.append([nums[i], nums[left], nums[right]])

                    # Move the left and right pointers to avoid duplicates
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1

                    # Move the pointers for the next check
                    left += 1
                    right -= 1

                elif current_sum < 0:
                    # If sum is less than zero, move left pointer to increase sum
                    left += 1
                else:
                    # If sum is greater than zero, move right pointer to decrease sum
                    right -= 1

        return result
