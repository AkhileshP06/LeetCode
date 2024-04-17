class Solution(object):
    def summaryRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        if not nums:
            return []

        # Initialize variables to track the start and end of the current range
        start = end = nums[0]
        # Initialize the result list
        result = []

        # Iterate through the sorted array
        for num in nums[1:]:
            # If the current number is consecutive with the previous one, update the end of the range
            if num == end + 1:
                end = num
            # If the current number is not consecutive, add the previous range to the result list
            # and update the start and end of the new range
            else:
                if start == end:
                    result.append(str(start))
                else:
                    result.append(str(start) + "->" + str(end))
                start = end = num

        # Add the last range to the result list
        if start == end:
            result.append(str(start))
        else:
            result.append(str(start) + "->" + str(end))

        return result