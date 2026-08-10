class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=numRows;
        while(n>0){
            List<Integer>list=new ArrayList<>();
            if(numRows==n){
                list.add(1);
            }else if(numRows-1==n){
                list.add(1);
                list.add(1);
            }else{
                List<Integer>preList=ans.get(ans.size()-1);
                list.add(1);
                for(int i=0;i<preList.size()-1;i++){
                    list.add(preList.get(i)+preList.get(i+1));
                }
                list.add(1);
            }
            n--;
            ans.add(list);
        }
        return ans;
    }
}