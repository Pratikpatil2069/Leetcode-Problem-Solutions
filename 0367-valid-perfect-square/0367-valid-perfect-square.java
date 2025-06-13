class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1 || num==4 || num==9){
            return true;
        }
        int n = num / 4;
        int left = 1;
        int right = n;
        while(left <= right){
           int mid = left + (right - left) / 2;
           long square = (long) mid * mid; // cast to long to avoid overflow
           if(square == num){
               return true;
           }
           if(square < num){
               left = mid + 1;
           } else {
               right = mid - 1;
           }
        }
        return false;   
    }
}
