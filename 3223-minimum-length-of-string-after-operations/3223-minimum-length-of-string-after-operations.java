class Solution {
    public int minimumLength(String s) {
       HashMap<Character,Integer>map=new HashMap<>();
       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }
       int ans=0;
       for(int val:map.values()){
        if(val>=3){
            if(val%2==0){
                ans+=2;
            }else{
                ans+=1;
            }
            
        }else{
            ans+=val;
        }
       }
       return ans;
    }

}