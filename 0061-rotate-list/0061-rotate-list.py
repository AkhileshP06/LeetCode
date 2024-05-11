# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        if not head or not head.next or k == 0:
            return head
        
        # Determine the length of the list
        length = 1
        current = head
        while current.next:
            current = current.next
            length += 1
        
        # Normalize k to avoid unnecessary rotations
        k %= length
        if k == 0:
            return head
        
        # Connect the end to the head to make the list circular
        current.next = head
        
        # Find the new tail (which will be the length - k - 1)
        steps_to_new_tail = length - k - 1
        new_tail = head
        for _ in range(steps_to_new_tail):
            new_tail = new_tail.next
        
        # The new head is the node after the new tail
        new_head = new_tail.next
        
        # Break the circular connection
        new_tail.next = None
        
        return new_head