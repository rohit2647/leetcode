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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode frwd = dummy;
        for(int i = 0 ; i<n ;i++){
            frwd = frwd.next;    
        }
        while (frwd.next != null){
            prev = prev.next;
            frwd = frwd.next;
        }
        prev.next = prev.next.next;
        return dummy.next;
    }
}