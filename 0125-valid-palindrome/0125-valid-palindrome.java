class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            sb.append(Character.toLowerCase(s.charAt(i)));
        }
       }
      
       return check(sb,0,sb.length()-1);
    }
    public boolean check(StringBuilder sb,int left,int right){
        if(left>right){
            return true;
        }
        if(sb.charAt(left)!=sb.charAt(right)){
            return false;
        }
        return check(sb,left+1,right-1);
    }
}