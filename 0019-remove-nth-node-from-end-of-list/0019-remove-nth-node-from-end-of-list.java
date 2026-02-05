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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp=head;
       ListNode ptr=head;
       while(n>0){
        ptr=ptr.next;
        n--;
       }
       if(ptr==null){
        return head.next;
       }
       while(ptr!=null && ptr.next!=null){
        ptr=ptr.next;
        temp=temp.next;
       }
       temp.next=temp.next.next;
       return head;

    }
}