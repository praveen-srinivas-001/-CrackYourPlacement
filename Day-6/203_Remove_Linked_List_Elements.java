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
        if (head == null) {
            return head;
        }

        // Let's do this by the dummy process
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val != val) {
                current.next = temp;
                temp = temp.next;
                current = current.next;
            } else {
                temp = temp.next;
            }
        }

        current.next = null;

        return dummy.next;
    }
}
