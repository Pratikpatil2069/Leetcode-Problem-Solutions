class Solution {
    public int maxCoins(int[] piles) {
        int sum=0;
        int noOfTriplets=piles.length/3;
        Arrays.sort(piles);
        for(int i=piles.length-2;i>=noOfTriplets;i=i-2){
            sum+=piles[i];
        }
        return sum;
    }
}