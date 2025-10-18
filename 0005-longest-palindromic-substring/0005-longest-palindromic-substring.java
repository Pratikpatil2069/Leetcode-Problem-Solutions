public class Solution {
    public String longestPalindrome(String s) {
       String s1="";
       for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            if(palindrom(i,j,s)){
                if(s1.length()<(j-i+1)){
                    s1=s.substring(i,j+1);
                }
            }
        }
       }
       return s1;
    }   
    private boolean palindrom(int i,int j,String s){
        String str=s.substring(i,j+1);
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 
}