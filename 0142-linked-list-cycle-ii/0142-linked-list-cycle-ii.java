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
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        Set<Integer>set=new HashSet<>();
        ListNode temp=head;
        while(temp.next!=null){
            set.add(temp.val);
            if(set.contains(temp.next.val)){
                return temp.next;
            }
            temp=temp.next;
        }
        return null;
    }
}