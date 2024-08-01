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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        if(curr==null || curr.next==null){
            return null;
        }
        int l=0;
        while(curr.next!=null){
            l++;
            curr = curr.next;
        }
        if(n==l+1){
            head = head.next;
            return head;
        }
        curr = head;
        int i=0;
        while(curr!=null){
            if(i == l-n){
                ListNode temp = curr.next;
                if(curr.next ==null) {
                    curr=null;
                    return head;
                }
                if(curr.next.next == null){
                    curr.next = null;
                    return head;
                    }
                else curr.next = curr.next.next;
            }
            curr=curr.next;
            i++;
        }
        return head;
    }
}
