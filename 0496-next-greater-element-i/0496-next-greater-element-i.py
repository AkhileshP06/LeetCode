class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        next_greater = {}
        stack = []

        # Iterate through nums2 to find the next greater element for each element
        for num in nums2:
            while stack and num > stack[-1]:
                next_greater[stack.pop()] = num
            stack.append(num)

        # For any remaining elements in the stack, update their next greater element with -1
        for num in stack:
            next_greater[num] = -1

        # Retrieve the next greater element for each element in nums1 from the dictionary
        return [next_greater.get(num, -1) for num in nums1]