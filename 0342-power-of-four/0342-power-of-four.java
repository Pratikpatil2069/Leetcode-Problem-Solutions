class Solution {
    public boolean isPowerOfFour(int n) {
        if( n > 0 && (n & (n - 1)) == 0){
            if(Integer.numberOfTrailingZeros(n)%2==0){
                return true;
            }
        }
    return false;
    }
}