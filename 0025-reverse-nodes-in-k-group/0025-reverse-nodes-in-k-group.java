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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next==null || k==1){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        ListNode ptr=dummy;
        while(hasNext(temp,k)){
            ListNode prev=null;
            ListNode next=null;
            ListNode groupStart=temp;
            for(int i=0;i<k;i++){
                next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
            }
           ptr.next=prev;
           groupStart.next=temp;
           ptr=groupStart;
            
        }
        return dummy.next;
    }
        private boolean hasNext(ListNode node,int k){
         int count=0;
        while(node!=null && count<k){
            node=node.next;
            count++;
        }
      return count==k;
    }
    
}