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
    public ListNode removeNodes(ListNode head) {
        ListNode ptr=head;
        ListNode temp=head.next;
        boolean flag=true;
        while(temp!=null){
            if(ptr.val<=temp.val){
                ptr=ptr.next;
                temp=temp.next;
            }else{
                if(flag){
                    head=ptr;
                    flag=false;
                }else{
                    if(head.val<ptr.val){
                        head=ptr;
                    }else{
                    ListNode temp2=head;
                    temp2.next=ptr;
                    temp2=temp.next;
                    }
                }
                
                ptr=ptr.next;
                temp=temp.next;
            }
        }
        if(flag){
            return head;
        }
        head.next=ptr;
        return head;
    }
}