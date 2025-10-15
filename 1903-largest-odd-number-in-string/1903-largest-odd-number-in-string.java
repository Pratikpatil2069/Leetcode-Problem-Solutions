class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb=new StringBuilder(num);
        int ind=-1;
        sb=sb.reverse();
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
           int val = ch - '0';
            if(val%2==1){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            return "";
        }
        ind=num.length()-ind;
        return num.substring(0,ind);
        
    }
}