class Solution {
    public boolean doesAliceWin(String s) {
        String str="aeiou";
        int count=0;
        for(int i=0;i<s.length();i++){
            String ch=s.substring(i,i+1);
            if(s.contains(ch)){
                count++;
            }
        }
        if(count%2==1){
            return true;
        }else{
            return false;
        }
        
    }
}