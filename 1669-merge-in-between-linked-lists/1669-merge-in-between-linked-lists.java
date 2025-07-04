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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode ptr=list1;
        int ind=1;
        while(ind!=b+2){
            if(ind<a){
                temp=temp.next;
            }
            if(ind<=b+1){
                ptr=ptr.next;
            }
            ind++;
        }
        ListNode val=list2;
        while(val.next!=null){
            val=val.next;
        }
        temp.next=list2;
        val.next=ptr;
        return list1;
    }
}