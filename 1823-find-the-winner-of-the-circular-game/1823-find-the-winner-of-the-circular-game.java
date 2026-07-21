class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        return winner(list,k,0);
    }
    private int winner(ArrayList<Integer>list,int k,int i){
        if(list.size()==1){
            return list.get(0);
        }
        i=(i+k-1)%list.size();
        list.remove(i);
        return winner(list,k,i);

    }
}