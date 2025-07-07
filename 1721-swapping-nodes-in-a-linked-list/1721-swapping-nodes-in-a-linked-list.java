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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int ind=0;
        ListNode temp=head;
        ListNode ptr=head;
        while(temp!=null){
            ind++;
            if(ind==k){
                ptr=temp;
            }
            temp=temp.next;
        }
        temp=head;
         ind=ind-k;
         if(ind==0){
         int num=ptr.val;
        ptr.val=temp.val;
        temp.val=num;
        return head; 
         }
        while(temp!=null){
            ind--;
            if(ind==0){
                break;
            }
            temp=temp.next;
        }
        temp=temp.next;
        int num=ptr.val;
        ptr.val=temp.val;
        temp.val=num;
        return head; 
    }
}