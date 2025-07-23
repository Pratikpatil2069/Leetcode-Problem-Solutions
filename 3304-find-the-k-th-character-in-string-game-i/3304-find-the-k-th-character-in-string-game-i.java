class Solution {
    public char kthCharacter(int k) {
        String s="a";
        StringBuilder sb=new StringBuilder();
         sb.append(s);
        return fun(k,sb);
    }
    public char fun(int k,StringBuilder sb){
         if(sb.length()>=k){
            return sb.charAt(k-1);
        }
        String s1=sb.toString();
         for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch=='z'){
                ch='a';
            }else{
                ch=(char)(ch+1);
            }
            sb.append(ch);
         }
        return fun(k,sb);
    }
}