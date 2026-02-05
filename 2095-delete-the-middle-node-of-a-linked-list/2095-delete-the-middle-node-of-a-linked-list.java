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
    public ListNode deleteMiddle(ListNode head) {
       if(head==null || head.next==null){
        return null;
       }
       ListNode ptr=head;
       ListNode temp=head;
       while(ptr!=null && ptr.next!=null){
        ptr=ptr.next;
        if(ptr.next==null){
            continue;
        }
        ptr=ptr.next;
        if(ptr.next==null){
            continue;
        }
        temp=temp.next;
       }
       temp.next=temp.next.next;
       return head;
    }
}