class Solution {
    public int smallestNumber(int n) {
        int x=1;
        int num=1;
    while(x<=n){
        x=(int)Math.pow(2,num++);
    }
        return x-1;
    }
}