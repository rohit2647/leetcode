/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node .val = node.next.val ;//we are changing the value of the current node with the next node 
        node.next = node.next.next;    // change delete the next node that is connected to the node and link the current node to the next 2nd node 
    }
}