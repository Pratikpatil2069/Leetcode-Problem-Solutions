class Solution {
    public String convertDateToBinary(String date) {
       String s1=Integer.toBinaryString(Integer.parseInt(date.substring(0,4)));
       String s2=Integer.toBinaryString(Integer.parseInt(date.substring(5,7)));
       String s3=Integer.toBinaryString(Integer.parseInt(date.substring(8,10)));
       return s1+"-"+s2+"-"+s3;
    }
}