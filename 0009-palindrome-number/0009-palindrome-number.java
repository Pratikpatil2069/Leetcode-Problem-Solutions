class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num=x;
        int dup=0;
        while(num!=0){
            int re=num%10;
            dup=dup*10+re;
            num=num/10;
        }
        if(x==dup){
            return true;
        }
     return false;   
    }
}