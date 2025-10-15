class Solution {
    public String largestOddNumber(String num) {
        int ind=-1;
        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);
           int val = ch - '0';
            if(val%2==1){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            return "";
        }
        
        return num.substring(0,ind+1);
        
    }
}