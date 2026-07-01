class Solution {
    public char kthCharacter(int k) {
       return kthChar(k,"a");
    }
    public char kthChar(int k,String str){
        if(str.length()>=k){
            return str.charAt(k-1);
        }
        str+=nextString(str,"",0);
        return kthChar(k,str);
    }
    public String nextString(String str,String s,int ind){
        if(ind>=str.length()){
            return s;
        }
        char ch=str.charAt(ind);
        if(ch=='z'){
            ch='a';
        }else{
            ch++;
        }
        return nextString(str,s+ch,ind+1);
        
    }
        
}