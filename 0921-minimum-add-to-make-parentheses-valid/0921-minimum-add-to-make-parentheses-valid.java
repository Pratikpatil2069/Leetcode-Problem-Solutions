class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count<0){
                    ans+=count*(-1);
                    count=0;
                }
                count++;
            }else{
                count--;
            }
        }
        return ans+(count<0?count*(-1):count);
        
    }
}