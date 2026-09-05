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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode present = head;
        while(present!=null && present.next!=null){
            if(present.val == present.next.val){
                present.next = present.next.next;
                
            }else{
                present = present.next;
            }
        }
        return head;
    }
}