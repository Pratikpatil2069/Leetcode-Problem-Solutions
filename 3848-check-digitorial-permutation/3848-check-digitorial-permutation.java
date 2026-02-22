class Solution {
    public boolean isDigitorialPermutation(int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int num=n;
        int sum=0;
        while(num>0){
            int re=num%10;
            map.put(re,map.getOrDefault(re,0)+1);
            int fact=1;
            for(int i=re;i>0;i--){
                fact*=i;
            }
            sum+=fact;
            num=num/10;
        }
        while(sum>0){
            int re= sum%10;
            if(map.containsKey(re)){
                map.put(re,map.getOrDefault(re,0)-1);
                if(map.get(re)<=0){
                    map.remove(re);
                }
            }else{
                return false;
            }
            sum=sum/10;
        }
        return map.isEmpty();
    }
}