class Solution {
    public char findKthBit(int n, int k) {
        String s1="0";
        for(int i=1;i<n;i++){
            StringBuilder inverted = new StringBuilder();
            for (char bit : s1.toCharArray()) {
                char invertedBit = (bit == '0') ? '1' : '0';  // Correct inversion
                inverted.append(invertedBit);
            }
            String reversed = new StringBuilder(inverted).reverse().toString();
            s1 =  s1 + "1" + reversed;
        }
        return s1.charAt(k-1);
    }
}