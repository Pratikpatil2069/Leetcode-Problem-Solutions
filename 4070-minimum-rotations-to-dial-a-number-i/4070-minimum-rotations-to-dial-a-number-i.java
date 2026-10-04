class Solution {
    public int minRotations(String s) {
        int sum=0;
        int num=0;
        
        for(int i=0;i<s.length();i++){
            
            sum+=Math.min(Math.abs(num-(s.charAt(i)-'0')), 10 - Math.abs(num - (s.charAt(i) - '0')));
            num=s.charAt(i)-'0';
            
        }
        return sum;
    }
}