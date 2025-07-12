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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode ptr = head;
        int num = 0;
        int num2 = 0;
        boolean flag = false;
        while (temp != null) {
            num2++;
            if (num2 % 2 == 1 && num < num2) {
                num = num2;
                num2 = 0;
                if (flag) {
                    ptr = temp;
                }
                flag = true;

            }

            if (num2 % 2 == 0 && num < num2) {
                num = num2;
                num2 = 1;
                temp = temp.next;
                ListNode val = ptr.next;
                ListNode x = null;
                while (val != temp) {
                    ListNode y = val.next;
                    val.next = x;
                    x = val;
                    val = y;
                }
                ptr.next=x;
                
                while (ptr.next != null) {
                    ptr = ptr.next;
                }
                ptr.next = temp;
                
            }
            if(temp==null){
                break;
            }
            temp=temp.next;
        }
        if ( ptr.next == null) {
            return head;
        }
        ListNode val = ptr;
        int count = 0;
        while (val != null) {
            val = val.next;
            count++;
        }
        val = ptr.next;
        if ((count - 1) % 2 == 0) {
            ListNode x = null;
            while (val != null) {
                ListNode y = val.next;
                val.next = x;
                x = val;
                val = y;
            }
            ptr.next=x;
        }
        return head;

    }
}