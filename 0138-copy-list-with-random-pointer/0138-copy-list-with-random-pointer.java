/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node temp=head;
        Node dummy=new Node(-1);
        Node temp1 =dummy;
        HashMap<Node,Node>map=new HashMap<>();
        while(temp!=null){
            Node newNode=new Node(temp.val);
            map.put(temp,newNode);
            temp1.next=newNode;
            temp1=newNode;
            temp=temp.next;
        }
        temp=head;
        temp1=dummy.next;
        while(temp1!=null){
            if(temp.random!=null){
                temp1.random=map.get(temp.random);
            }
            temp1=temp1.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}