class Solution {
    public boolean isPalindrome(int x) {
        int ori=x;
        int dup=0;
        while(x>0){
            dup=dup*10+x%10;
            x=x/10;
        }
        return ori==dup;
    }
}