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
    public ListNode sortList(ListNode head) {
        ArrayList list=new ArrayList<>();
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        temp=dummy;
        for(int i=0;i<list.size();i++){
            temp.next=new ListNode((int)list.get(i));
            temp=temp.next;
        }
        return dummy.next;
        
    }
}