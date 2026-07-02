class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long N = n;
        if (N < 0) {
            N = -1 * N;
            return 1 / pow(x, N);
        }
        return pow(x, N);

    }

    public double pow(double x, long n) {
        
        if(n==0){
            return 1;
        }
        double half=pow(x, n/2);
        if(n%2!=0){
            return half*half*x;
        }
        
        return half*half;

    }
}