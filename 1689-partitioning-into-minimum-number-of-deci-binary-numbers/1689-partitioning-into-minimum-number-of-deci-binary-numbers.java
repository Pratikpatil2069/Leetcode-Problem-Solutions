class Solution {
    public int minPartitions(String n) {
        
        int maxDig = 0;
        for (char ch : n.toCharArray()) {
            maxDig = Math.max(maxDig, ch - '0');
        }

        return maxDig;
    }
}