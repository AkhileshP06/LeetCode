# Definition for singly-linked list
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        # Function to reverse a linked list
        def reverseList(node):
            prev = None
            while node:
                next_node = node.next
                node.next = prev
                prev = node
                node = next_node
            return prev

        # Find the middle of the linked list
        slow = fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        
        # Reverse the second half of the linked list
        second_half_reversed = reverseList(slow)
        
        # Compare the first half with the reversed second half
        first_half = head
        while second_half_reversed:
            if first_half.val != second_half_reversed.val:
                return False
            first_half = first_half.next
            second_half_reversed = second_half_reversed.next
        
        # If all nodes matched, the list is a palindrome
        return True
