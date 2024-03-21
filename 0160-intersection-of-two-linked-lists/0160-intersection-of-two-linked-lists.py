# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        def get_length(head):
            length = 0
            while head:
                length += 1
                head = head.next
            return length

        # Calculate the lengths of both lists
        lengthA, lengthB = get_length(headA), get_length(headB)

        # Traverse the longer list by the difference in lengths
        while lengthA > lengthB:
            headA = headA.next
            lengthA -= 1
        while lengthB > lengthA:
            headB = headB.next
            lengthB -= 1

        # Traverse both lists in parallel until a common node is found
        while headA != headB:
            headA = headA.next
            headB = headB.next

        # Return the common node (or None if no intersection)
        return headA