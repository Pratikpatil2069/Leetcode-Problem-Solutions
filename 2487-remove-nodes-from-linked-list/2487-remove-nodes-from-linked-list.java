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
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        Stack<Integer>stack=new Stack<>();
            while(temp!=null){
            if(stack.isEmpty() || temp.val<=stack.peek()){
                stack.push(temp.val);
                temp=temp.next;
            }else{
                if(stack.isEmpty()){
                    stack.push(temp.val);
                    temp=temp.next;
                }else{
                stack.pop();
                }
            }
        }
        head=null;
        while(!stack.isEmpty()){
            int val=stack.peek();
            ListNode node=new ListNode(val);
            node.next=head;
            head=node;
            stack.pop();
        }
        return head;
    }
}