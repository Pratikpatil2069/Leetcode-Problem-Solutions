class Solution {
    public int beautySum(String s) {
        int sum=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
               for(int val:map.values()){
                 max=Math.max(max,val);
                min=Math.min(min,val);
               }
                sum+=(max-min);
            }
            map.clear();
        }
     return sum;   
    }
}