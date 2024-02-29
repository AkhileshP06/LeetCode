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
    private ListNode result, lastPtr;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int bal = 0;
        for (ListNode ptr1 = l1, ptr2 = l2; ptr1 != null || ptr2 != null;) {
            int sum = 0;
            if (ptr1 == null && ptr2 != null) {
                sum = ptr2.val;
                ptr2 = ptr2.next;
            } else if (ptr2 == null && ptr1 != null) {
                sum = ptr1.val;
                ptr1 = ptr1.next;
            } else {
                sum = ptr1.val + ptr2.val;
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            sum += bal;
            if (sum > 9) {
                sum = sum % 10;
                addToResult(sum);
                bal = 1;
            } else {
                addToResult(sum);
                bal = 0;
            }    
        }
        if (bal == 1) {
            addToResult(bal);
        }
        return result;
    }
    
    private void addToResult(int val) {
        ListNode newNode = new ListNode(val);
        if (result == null) {
            result = newNode;
            lastPtr = newNode;
        } else {
            lastPtr.next = newNode;
            lastPtr = newNode;
        }
    }
    
    private void print(ListNode node) {
        StringBuilder str = new StringBuilder();
        for (ListNode ptr1 = node; ptr1 != null; ptr1 = ptr1.next) {
            if (!str.equals("")) {
                str.append(",");
            }
            str.append(ptr1.val);
        }
        System.out.println("["+str.toString()+"]");
    }
}