/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Queue<Node>queue=new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            Node dummy=new Node(-1);
            for(int i=0;i<size;i++){
                Node ptr=queue.poll();
                if(ptr.left!=null){
                    queue.add(ptr.left);
                }
                if(ptr.right!=null){
                    queue.add(ptr.right);
                }
                dummy.next=ptr;
                dummy=dummy.next;
            }
        }
        return root;
        
    }
}