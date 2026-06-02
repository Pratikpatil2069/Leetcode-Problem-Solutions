class Solution {
    public double myPow(double x, int n) {
       
        double ans=1;
        long  nn=n;
        if(nn<0){
            nn=-1*nn;
            return 1/pow(x,nn,ans);
        }
        return pow(x,nn,ans);
        
    }
    public double pow(double x,double n,double ans){
        if(n==0){
            return ans;
        }
        if(n%2==0){
            x=x*x;
            n=n/2;
        }else{
            ans=ans*x;
            n=n-1;
        }
        return pow(x,n,ans);
        
        
    }
}