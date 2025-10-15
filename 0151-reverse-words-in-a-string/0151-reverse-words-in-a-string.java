class Solution {
    public String reverseWords(String s) {
        StringBuilder sb =new StringBuilder();
        s=s.trim();
        String arr[]=s.split("\s+");
        for(int i=arr.length-1;i>=0;i--){
            StringBuilder str=new StringBuilder(arr[i]);
            sb.append(str);
            if(i!=0){
                sb.append(" ");
            }
            
        }
        return sb.toString();
        
    }
}