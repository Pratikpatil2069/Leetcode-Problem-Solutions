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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode start = head;
        ListNode end = head;
        boolean flag=true;
        ListNode prevGroup=null;
        int count = k;
        while (end != null) {

            if (count > 0) {
                end = end.next;
                count--;
            }

            if (count == 0) {
                ListNode temp = start;
                ListNode ptr = end;
                while (temp != end) {
                    ListNode temp1 = temp.next;
                    temp.next = ptr;
                    ptr = temp;
                    temp = temp1;
                }
                if(flag){
                    head=ptr;
                    flag=false;
                }
                if(prevGroup!=null){
                    prevGroup.next=ptr;
                }
                prevGroup=start;
                start=end;
                count=k;
            }

        }
        return head;
    }
}