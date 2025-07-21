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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(ListNode a,ListNode b){
                return a.val-b.val;
            }
        });
        for(int i=0;i<lists.length;i++){
            ListNode head=lists[i];
            while(head!=null){
                pq.add(head);
                head=head.next;
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode head=dummy;
        while(!pq.isEmpty()){
            ListNode temp=pq.poll();
            dummy.next=temp;
            dummy=temp;
        }
        dummy.next=null;
     return head.next;   
    }
}