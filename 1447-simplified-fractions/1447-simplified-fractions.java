class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String>list=new ArrayList<>();
        Set<Double>set=new HashSet<>();
        for(int  i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(!set.contains((double)i/(double)j)){
                    String str=""+i+"/"+j;
                    list.add(str);
                    set.add((double)i/(double)j);
                }
            }
        }
        return list;
    }
}