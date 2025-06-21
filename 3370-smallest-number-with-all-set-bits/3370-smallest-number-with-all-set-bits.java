class Solution {
    public int smallestNumber(int n) {
        String s=Integer.toBinaryString(n);
        String s1=s.replace('0','1');
        return Integer.parseInt(s1,2);
        
    }
}