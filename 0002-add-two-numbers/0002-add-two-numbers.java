class Solution {

    public static int size(ListNode head) {
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int size1 = size(l1);
        int size2 = size(l2);

        int max = Math.max(size1, size2);

        ListNode sum = new ListNode(0);
        ListNode temp = sum;

        int carry = 0;

        for (int i = 0; i < max; i++) {

            int a = 0;
            int b = 0;

            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }

            int total = a + b + carry;

            temp.val = total % 10;
            carry = total / 10;

            if (i < max - 1) {
                temp.next = new ListNode(0);
                temp = temp.next;
            }
        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return sum;
    }
}