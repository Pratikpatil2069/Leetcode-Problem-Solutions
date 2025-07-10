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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        ListNode ptr=head.next;
        int n=0;
        while(temp!=null){
             n++;
            temp=temp.next;
        }
        temp=head;
        int i=0;
        int arr[]=new int[n];
        while(temp.next!=null){
            if(temp.val<ptr.val){
                arr[i++]=ptr.val;
                temp=temp.next;
                ptr=temp.next;
            }else{
                ptr=ptr.next;
                if(ptr==null){
                    i++;
                    temp=temp.next;
                    ptr=temp.next;
                }
            }
        }
        return arr;
    }
}