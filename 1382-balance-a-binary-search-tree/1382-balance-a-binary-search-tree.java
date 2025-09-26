class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list); 
        return buildTree(list, 0, list.size() - 1);
    }

    
    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

   
    private TreeNode buildTree(List<Integer> list, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = buildTree(list, left, mid - 1);
        node.right = buildTree(list, mid + 1, right);
        return node;
    }
}
