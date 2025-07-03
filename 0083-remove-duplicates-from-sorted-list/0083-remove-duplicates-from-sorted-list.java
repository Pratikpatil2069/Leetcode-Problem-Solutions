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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode ptr=head.next;
        while(ptr!=null){
            if(temp.val==ptr.val){
                ptr=ptr.next;
            }else{
                temp.next=ptr;
                temp=ptr;
                ptr=ptr.next;
            }
        }
        temp.next=null;
        return head;
        
    }
}