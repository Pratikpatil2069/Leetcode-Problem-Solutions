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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        ListNode temp=head;
        int count=0;
        boolean flag=false;
        while(temp!=null){
            if(set.contains(temp.val)){
                 temp=temp.next;
                 flag=true;
            }else{
                if(flag){
                    count++;
                }
                temp=temp.next;
                flag=false;
            }
        }
        if(flag){
            count++;
        }
        return count;
    }
}