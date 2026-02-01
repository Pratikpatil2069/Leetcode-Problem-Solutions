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
    public ListNode reverseList(ListNode head) {
        ListNode temp=null;
        ListNode ptr=head;
         
        
        return reverse(temp,ptr);  
    }
    private ListNode reverse(ListNode temp,ListNode ptr){
        if(ptr==null){
            return temp;
        }
        ListNode ptr1=ptr.next;
        ptr.next=temp;
        temp=ptr;
        ptr=ptr1;
        return reverse(temp,ptr);
    }
      
}
