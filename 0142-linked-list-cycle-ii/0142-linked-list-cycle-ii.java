public class Solution
{
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // cycle detected
                ListNode p = head;
                while (p != slow) { // move both pointers one step at a time until they meet
                    p = p.next;
                    slow = slow.next;
                }
                return p; // start node of the cycle
            }
        }
        return null; // no cycle detected
    }
}