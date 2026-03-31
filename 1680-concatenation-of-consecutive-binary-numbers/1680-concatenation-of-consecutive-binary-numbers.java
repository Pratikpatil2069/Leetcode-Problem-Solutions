class Solution {
    public int concatenatedBinary(int n) {
        StringBuilder sb=new StringBuilder();
        int mod = 1000000007;
        for(int i=1;i<=n;i++){
            sb.append(Integer.toBinaryString(i));
        }
        String str=sb.toString();
        long ans = 0;   

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            ans = (ans * 2 + num) % mod;   
        }

        return (int)ans;
    }
}