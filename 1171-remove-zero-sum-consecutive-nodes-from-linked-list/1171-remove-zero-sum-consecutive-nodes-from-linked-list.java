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
    public ListNode removeZeroSumSublists(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        for(int i=0;i<list.size();i++){
            int sum=0;
            for(int j=i;j<list.size();j++){
                sum+=list.get(j);
                if(sum==0){
                    int ind=j;
                    for(int k=i;k<=ind;k++){
                        list.remove(i);
                    }
                    i=-1;
                    break;
                }
            }
        }
        ListNode dummy=new ListNode(-1);
        temp=dummy;
        for(int i=0;i<list.size();i++){
            ListNode newNode=new ListNode(list.get(i));
            temp.next=newNode;
            temp=newNode;
        }
        return dummy.next;
        
    }
}