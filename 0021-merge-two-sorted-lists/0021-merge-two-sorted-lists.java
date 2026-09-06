 class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        ListNode n1 = list1;
        ListNode n2 = list2;

        while (n1 != null && n2 != null) {

            if (n1.val <= n2.val) {
                current.next = n1;
                n1 = n1.next;
            } 
            else {
                current.next = n2;
                n2 = n2.next;
            }

            current = current.next;
        }

        if (n1 != null) {
            current.next = n1;
        }

        if (n2 != null) {
            current.next = n2;
        }

        return dummy.next;
    }
}