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
        while(temp!=null){
            if((head.val<ptr.val && temp.val<ptr.val) || (head.val>ptr.val && temp.val>ptr.val) ){
                list.add(ind);
            }
            head=head.next;
            ptr=head.next;
            temp=ptr.next;
            ind++;
        }
        if(list.size()<=1){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        arr[1]=list.get(list.size()-1)-list.get(0);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            min=Math.min(min,(list.get(i+1)-list.get(i)));
        }
        arr[0]=min;
        return arr;
    }
}