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
        if(head==null || (head.next==null && n==1)){
            return null;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        count=count-n;
        if(count==0){
            return head.next;
        }
        while(count>1){
            temp=temp.next;
            count--;
        }
        ListNode ptr=temp.next;
        if(ptr==null){
            temp.next=null;
        }else{
            ptr=ptr.next;
        }
        temp.next=ptr;
        return head;
    }
}