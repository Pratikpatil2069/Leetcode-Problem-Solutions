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
        ListNode temp=head;
        ListNode ptr=head;
        ListNode temp2=head;
        boolean flag=false;
        while(ptr!=null){
            ptr=ptr.next;
            if(ptr==null){
                break;  
            }
            ptr=ptr.next;
            temp=temp.next;
            if(flag){
               temp2=temp2.next;
            }else{
            flag=true;
            }
        }
        temp2.next=temp.next;
        return head;
    }
}