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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        ListNode ptr=head.next;
        List<Integer>list=new ArrayList<>();
        while(temp.next!=null){
            if(temp.val<ptr.val){
                list.add(ptr.val);
                temp=temp.next;
                ptr=temp.next;
            }else{
                ptr=ptr.next;
                if(ptr==null){
                    list.add(0);
                    temp=temp.next;
                    ptr=temp.next;
                }
            }
        }
        list.add(0);
        int arr[]=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}