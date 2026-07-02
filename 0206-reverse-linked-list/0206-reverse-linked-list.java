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
        return reverse(head,null);
    }
    private ListNode reverse(ListNode head,ListNode temp){
        if(head==null){
            return temp;
        }
        ListNode ptr=head.next;
        head.next=temp;
        temp=head;
        return reverse(ptr,temp);
    }
    
      
}
