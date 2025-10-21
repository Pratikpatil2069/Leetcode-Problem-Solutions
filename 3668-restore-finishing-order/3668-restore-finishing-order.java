class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<friends.length;i++){
            set.add(friends[i]);
        }
        int ind=0;
        int arr[]=new int[friends.length];
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                arr[ind++]=order[i];
            }
        }
        return arr;
        
    }
}