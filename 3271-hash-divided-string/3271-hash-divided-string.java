class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i=i+k){
            String str=s.substring(i,i+k);
            int sum=0;
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                sum+=(ch-'a');
            }
            int re=sum%26;
            char finalChar=(char)(re+'a');
            sb.append(finalChar);
        }       
        return sb.toString();
    }
}