/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
    TreeNode temp;
    Deque<TreeNode>queue;

    public FindElements(TreeNode root) {
        temp=root;
        queue=new ArrayDeque<>();
        
    }
    
    public boolean find(int target) {
        temp.val=0;
        if(temp.val==target){
            return true;
        }
        queue.add(temp);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode ptr=queue.poll();
                if(ptr.left!=null){
                    int val1=ptr.val*2+1;
                    if(val1==target){
                        return true;
                    }else{
                        ptr.left.val=val1;
                        queue.add(ptr.left);
                    }
                }
                if(ptr.right!=null){
                    int val2=ptr.val*2+2;
                    if(val2==target){
                        return true;
                    }else{
                        ptr.right.val=val2;
                        queue.add(ptr.right);
                    }
                }
            }
        }
        return false;
        
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */