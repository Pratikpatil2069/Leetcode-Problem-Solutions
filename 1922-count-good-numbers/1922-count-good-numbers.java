class Solution {
     long mod=1000000007;
    public int countGoodNumbers(long n) {
        long even=n/2;
        long odd=n/2;
       
        if(n%2==1){
            even++;
        }
        long num1=pow(5,even,1);
        long num2=pow(4,odd,1);
        return (int)((num1*num2)%mod);
        
    }
    public long pow(long x,long n,long ans){
        if(n==0){
            return ans;
        }
        if(n%2==0){
            x=(x*x)%mod;
            n/=2;
        }else{
            ans=(ans*x)%mod;
            n-=1;
        }
        return pow(x,n,ans);
    }
}