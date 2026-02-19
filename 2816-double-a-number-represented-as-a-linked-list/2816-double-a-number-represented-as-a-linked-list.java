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
    public ListNode doubleIt(ListNode head) {
        Stack<ListNode>stack=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        boolean flag=false;
        while(!stack.isEmpty()){
            ListNode ptr=stack.pop();
            int num=ptr.val*2;
            if(flag){
                num++;
                flag=false;
            }
            if(num>9){
                int val=num%10;
                ptr.val=val;
                flag=true;
            }else{
                ptr.val=num;
            }
        }
        if(flag){
            ListNode newNode=new ListNode(1);
            newNode.next=head;
            head=newNode;
        }
        return head;
        
    }
}