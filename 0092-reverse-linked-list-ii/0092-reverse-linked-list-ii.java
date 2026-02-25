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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=null;
        ListNode ptr=head;
        int forword=left;
       while(forword>1){
        ptr=ptr.next;
        if(temp==null){
            temp=head;
        }else{
            temp=temp.next;
        }
        forword--;
       }
       ListNode re=null;
       ListNode end=null;
       while(left<=right){
        ListNode ptr1=ptr.next;
        ptr.next=re;
        if(re==null){
            end=ptr;
        }
        re=ptr;
        ptr=ptr1;
        left++;
       }
       end.next=ptr;
       if(temp==null){
        head=re;
       }else{
        temp.next=re;
       }
       
        return head;
    }
}