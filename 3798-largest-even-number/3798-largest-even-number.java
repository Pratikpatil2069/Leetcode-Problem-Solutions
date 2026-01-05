class Solution {
    public String largestEven(String s) {
        int count=s.length();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                count--;
            }else{
                break;
            }
        }
       
        return s.substring(0,count);
    }
}