class Solution {
    public boolean doesAliceWin(String s) {
        String str="aeiou";
        boolean flag=false; 
        for(int i=0;i<s.length();i++){
            String ch=s.substring(i,i+1);
            if(str.contains(ch)){
                return true;
            }
        }
       return false;
        
    }
}