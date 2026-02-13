class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }

        k = k % len;
        if (k == 0) return head;

        head = reverse(head, 0, len - 1, true, false);
        head = reverse(head, 0, k - 1, true, true);
        head = reverse(head, k, len - 1, false, false);

        return head;
    }

    private ListNode reverse(ListNode temp, int start, int end,
                             boolean flag1, boolean flag2) {

        ListNode head = temp;
        int ind = 0;

        // Move to start
        while (ind < start) {
            temp = temp.next;
            ind++;
        }

        ListNode prev = null;
        ListNode curr = temp;
        ListNode startNode = temp;

        for (int i = start; i <= end; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if (start != 0) {
            ListNode temp2 = head;
            for (int i = 0; i < start - 1; i++)
                temp2 = temp2.next;

            temp2.next = prev;
        } else {
            head = prev;
        }

        startNode.next = curr;

        return head;
    }
}
