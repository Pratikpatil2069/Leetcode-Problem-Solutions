class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        int n=part.length();
        for(int i=0;i<=sb.length()-n;i++){
            if(sb.substring(i,i+n).equals(part)){
                sb.delete(i,i+n);
                i=i-n;
                if(i<0){
                    i=-1;
                }
            }
        }
        return sb.toString();
    }
}