class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        int count=0;
        int num=1;
        while(n>0){
            n=n-num;
            if(n>=0){
            count++;
            }
            num++;
        }
        return count;
    }
}