class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Make sure list1 starts with the smaller value
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode head = list1;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.next == null || temp1.next.val > temp2.val) {
                // Insert temp2 between temp1 and temp1.next
                ListNode nextTemp2 = temp2.next;
                temp2.next = temp1.next;
                temp1.next = temp2;
                temp2 = nextTemp2;
            }
            temp1 = temp1.next;
        }

        return head;
    }
}
