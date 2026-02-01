/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ListNode ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            if(ptr==null){
                return false;
            }
            ptr=ptr.next;
            temp=temp.next;
            if(ptr==temp){
                return true;
            }
        }
        return false;
    }
}