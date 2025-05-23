class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            int left=i;
            int right=i+2;
            String str=s.substring(left,right+1);
            char a=str.charAt(0);
            char b=str.charAt(1);
            char c=str.charAt(2);
            if(a!=b && a!=c && b!=c){
                count++;
            } 
        }
        return count;
    }
}