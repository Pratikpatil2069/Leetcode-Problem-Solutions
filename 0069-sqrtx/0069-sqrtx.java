class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        if(x<=3){
            return 1;
        }
        if(x>=4 && x<=8){
            return 2;
        }
        if(x>=9 && x<=17){
            return 3;
        }
        int n=x/4;
        int left=1;
        int right=n;
        while(left<=right){
            int mid=left+(right-left)/2;
            long square=(long)mid*mid;
            if(square==x){
                return mid;
            }
            if(square<x){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }        
        return right;
    }
}