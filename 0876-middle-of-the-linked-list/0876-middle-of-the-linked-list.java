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
    public ListNode middleNode(ListNode head) {
       ListNode temp=head;
       ListNode ptr=head;
       while(ptr!=null && ptr.next!=null){
        ptr=ptr.next;
        if(ptr==null){
            return temp.next;
        }
        ptr=ptr.next;
        temp=temp.next;
       }
       return temp;
    }
}