class Solution {
    public int[] evenOddBit(int n) {
        int[] arr = new int[2];  
        
        String s = Integer.toBinaryString(n);
        int length = s.length();

        for (int i = 0; i < length; i++) {
            
            int pos = length - 1 - i;  
            if (s.charAt(i) == '1') {
                if (pos % 2 == 0) {
                    arr[0]++;  
                } else {
                    arr[1]++;  
                }
            }
        }
        return arr;
    }
}
