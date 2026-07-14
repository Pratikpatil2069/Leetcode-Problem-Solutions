class Solution {
    public boolean isPowerOfThree(int n) {
        return check(n);
    }
    private boolean check(int n){
        if(n<=0){
            return false;
        } 
        if(n==1){
            return true;
        }
        if(n%3!=0){
            return false;
        }
        return check(n/3);
        
    }
}