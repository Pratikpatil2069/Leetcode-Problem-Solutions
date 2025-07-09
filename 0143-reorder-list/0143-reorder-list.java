class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return; // ❌ you had `return head;` in a void method
        }

        // Find the middle node using slow and fast pointers
        ListNode temp = head;
        ListNode ptr = head;
        while (ptr != null && ptr.next != null && ptr.next.next != null) {
            temp = temp.next;
            ptr = ptr.next.next; // ✅ simplified: move fast pointer twice directly
        }

    
        ListNode ptr2 = temp.next;
        temp.next = null; // 
        ListNode ptr3 = null;

        while (ptr2 != null) {
            ListNode next = ptr2.next;
            ptr2.next = ptr3;
            ptr3 = ptr2;
            ptr2 = next;
        }

        ListNode first = head;
        ListNode second = ptr3;

        while (second != null) { 
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    }
}
