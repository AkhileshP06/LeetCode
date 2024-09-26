/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        // Use a pointer to iterate through the list
        ListNode current = head;

        // Traverse the list to remove subsequent nodes with the given value
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;  // Skip the node with the given value
            } else {
                current = current.next;  // Move to the next node
            }
        }

        return head;
    }
}