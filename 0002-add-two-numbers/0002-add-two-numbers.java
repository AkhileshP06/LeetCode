/* Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy head to simplify edge cases
        ListNode current = dummyHead; // Pointer to build the result list
        int carry = 0; // Store carry-over value

        // Iterate through both lists until both pointers are null
        while (l1 != null || l2 != null) {
            // Get the values from both lists, or 0 if the list has been fully traversed
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate sum and update carry
            int sum = val1 + val2 + carry;
            carry = sum / 10; // New carry for the next iteration

            // Create a new node for the current digit of the sum
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes in the input lists
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's any remaining carry, add it as the last node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next; // Return the head of the result list, skipping the dummy head
    }
}
