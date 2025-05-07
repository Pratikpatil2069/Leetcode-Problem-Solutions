class Solution {
    public boolean isSubsequence(String s, String t) {
        int ind=0;
        for(int i=0;i<s.length();i++){
            int flag=0;
            for(int j=ind;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    flag=1;
                    ind=j+1;
                    break;
                }
            }
            if(flag==0){
                return false;
            }
        }
        return true;
    }
}