class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(goal.equals(sb.toString())){
                return true;
            }
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
        }

        return false;
    }
}