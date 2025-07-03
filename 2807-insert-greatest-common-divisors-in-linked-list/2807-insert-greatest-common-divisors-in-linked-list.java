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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode ptr=head.next;
        while(ptr!=null){
            int a=temp.val;
            int b=ptr.val;
            while(b!=0){
                int key=b;
                b=a%b;
                a=key;
            }
            int num=Math.abs(a);
            ListNode mid=new ListNode(num);
            temp.next=mid;
            mid.next=ptr;
            temp=ptr;
            ptr=ptr.next;
        }
        return head;
    }
}