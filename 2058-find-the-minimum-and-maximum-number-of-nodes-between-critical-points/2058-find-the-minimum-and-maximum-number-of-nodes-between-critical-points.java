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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int arr[]=new int [2];
        List<Integer> list=new ArrayList<>();
        if(head==null || head.next==null || head.next.next==null){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        ListNode ptr=head.next;
        ListNode temp=ptr.next;
        int ind=1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        boolean flag=true;
        boolean flag1=true;
        int first=0;
        int indFirst=0;
        while(temp!=null){
            if((head.val<ptr.val && temp.val<ptr.val) || (head.val>ptr.val && temp.val>ptr.val) ){
                if(flag){
                 first=ind;
                 indFirst=ind;
                flag=false;
                }else{
                    min=Math.min(min,ind-first);
                    first=ind;
                    flag1=false;
                }
            }
            head=head.next;
            ptr=head.next;
            temp=ptr.next;
            ind++;
        }
        if((flag!=flag1)|| flag){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        arr[0]=min;
        arr[1]=first-indFirst;
        return arr;
    }
}