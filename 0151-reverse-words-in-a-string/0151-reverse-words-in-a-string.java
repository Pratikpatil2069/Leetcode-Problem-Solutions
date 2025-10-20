class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       String s1="";
        String arr[]=s.split("\s+");
        for(int i=arr.length-1;i>=0;i--){
            s1+=arr[i];
            if(i!=0){
                 s1+=" ";
            }
           
        }
        return s1;
    }
}