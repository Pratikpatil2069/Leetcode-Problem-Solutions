class Solution {
    public boolean isPrefixString(String s, String[] words) {
        if(s.length()<words[0].length()){
            return false;
        }
        int  length=0;
        for(int i=0;i<words.length;i++){
            length=words[i].length()+length;
            if(s.length()==length){
                break;
            }
        }
        if(length!=s.length()){
            return false;
        }
        String s1="";
        for(int i=0;i<words.length;i++){
            s1=s1+words[i];
        }
        if(s1.startsWith(s)){
            return true;
        }
        return false;
    }
}