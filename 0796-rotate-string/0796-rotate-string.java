class Solution {
    public boolean rotateString(String s, String goal) {
          StringBuilder sb=new StringBuilder(goal);
          for(int i=0;i<s.length();i++){
            if(s.equals(sb.toString())){
                return true;
            }
            char ch=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
          }
          return false;
    }
}