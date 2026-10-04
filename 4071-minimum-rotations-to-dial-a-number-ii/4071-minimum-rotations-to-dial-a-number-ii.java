class Solution {
    public int minRotations(int n, String s) {
        int sum=0;
        int num=0;
        
        for(int i=0;i<s.length();i++){
            
            sum+=Math.min(Math.abs(num-(s.charAt(i)-'0')), 10 - Math.abs(num - (s.charAt(i) - '0')));
            num=s.charAt(i)-'0';
            
        }
        
        int ans = sum;
        
        for(int k=0;k<n;k++){
            int a, b;
            
            if(k==0){
                a = Math.min(s.charAt(0)-'0', 10-(s.charAt(0)-'0'));
                b = Math.min(s.charAt(n-1)-'0', 10-(s.charAt(n-1)-'0'));
            }else{
                a = Math.abs((s.charAt(k-1)-'0')-(s.charAt(k)-'0'));
                a = Math.min(a, 10-a);
                
                b = Math.abs((s.charAt(k-1)-'0')-(s.charAt(n-1)-'0'));
                b = Math.min(b, 10-b);
            }
            
            ans = Math.min(ans, sum-a+b);
        }
        
        return ans;
    }
}