class Solution {
    public boolean isPalindrome(int x) {
        int ori=x;
        int dup=0;
        while(x>0){
            int re=x%10;
            dup=dup*10+re;
            x=x/10;
        }
        if(ori==dup){
            return true;
        }
        return false;
    }
}