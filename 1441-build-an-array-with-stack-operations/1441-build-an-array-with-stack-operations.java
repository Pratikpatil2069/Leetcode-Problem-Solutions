class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>list=new ArrayList<>();
        int first=1;
        int last=0;
        int ind=0;
        for(int i=1;i<=n;i++){
            if(target[ind]==i){
                last=i;
                for(int j=1;j<last-first;j++){
                    list.add("Pop");
                }
                list.add("Push");
                first=last;
                ind++;
                if(ind==target.length){
                    return list;
                }
            }else{
                list.add("Push");
            }
            
        }
        return list;
        
    }
}