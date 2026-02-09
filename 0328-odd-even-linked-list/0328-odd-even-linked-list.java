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
    public ListNode oddEvenList(ListNode head) {
        if(head.next==null || head==null){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode ptr=head;
        while(ptr!=null && ptr.next!=null){
            temp.next=new ListNode(ptr.val);
            temp=temp.next;
            ptr=ptr.next.next;
        }
         if (ptr != null) {
            temp.next=new ListNode(ptr.val);
            temp = temp.next;
        }
        ptr=head.next;
         while(ptr!=null && ptr.next!=null){
            temp.next=new ListNode(ptr.val);
            temp=temp.next;
            ptr=ptr.next.next;
        }
         if (ptr != null) {
            temp.next=new ListNode(ptr.val);
            temp = temp.next;
        }
        
        return dummy.next;
       
    }
}