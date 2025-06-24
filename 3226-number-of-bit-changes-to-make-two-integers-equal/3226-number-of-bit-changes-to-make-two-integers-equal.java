class Solution {
    public int minChanges(int n, int k) {
        int count=0;
        if(n==k){
            return 0;
        }
        while(n>0 || k>0){
            if((n&1)==1 && (k&1)==0){
                count++;
            }else if((n&1)==0 && (k&1)==1){
                return -1;
            }
            n=n>>1;
            k=k>>1;
        }
        return count;
    }
}