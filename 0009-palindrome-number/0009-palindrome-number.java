class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int ori=x;
        int dup=0;
        while(num>0){
            int re=num%10;
            dup=dup*10+re;
            num=num/10;
        }
        if(ori==dup){
            return true;
        }
        return false;
    }
}