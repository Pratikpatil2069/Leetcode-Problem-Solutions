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
    public int pairSum(ListNode head) {
        List<Integer>list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int left=0;
        int right=list.size()-1;
        int max=0;
        while(left<right){
            max=Math.max(max,list.get(left)+list.get(right));
            left++;
            right--;
        }
        return max;
    }
}