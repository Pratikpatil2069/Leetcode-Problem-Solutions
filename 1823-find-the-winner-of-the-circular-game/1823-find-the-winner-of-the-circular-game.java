class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
         int ind=-1;
        while(list.size()!=1){
            int count=k;
            while(count!=0){
                ind=(ind+1)%list.size();
                count--;
            }
            list.remove(ind);
            ind=(ind-1)%list.size();
        }
        return list.get(0);
    }
}