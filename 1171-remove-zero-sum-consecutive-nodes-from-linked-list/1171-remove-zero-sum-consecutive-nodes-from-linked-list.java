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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        HashMap<Integer,ListNode> prefixMap = new HashMap<>();
         int prefixSum = 0;
        ListNode current = dummy;
        
        // First pass: calculate prefix sum and store the most recent occurrence of each prefix sum
        while (current != null) {
            prefixSum += current.val;
            prefixMap.put(prefixSum, current);
            current = current.next;
        }
        
        // Second pass: reset the prefix sum and use the map to skip zero-sum subsequences
        current = dummy;
        prefixSum = 0;
        
        while (current != null) {
            prefixSum += current.val;
            // Jump over the zero-sum subsequence by linking to the node stored in the prefix map
            current.next = prefixMap.get(prefixSum).next;
            current = current.next;
        }
        
        return dummy.next;
        
    }
}