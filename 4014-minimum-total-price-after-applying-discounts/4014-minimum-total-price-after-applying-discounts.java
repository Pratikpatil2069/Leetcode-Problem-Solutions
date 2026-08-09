class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double finalPrice=0;
        int j=discounts.length-1;
        for(int i=prices.length-1;i>=0;i--){
            if(j>=0){
                finalPrice+=(double)(prices[i]*(100-discounts[j--]))/100;
            }else{
                finalPrice+=prices[i];
            }
            
        }
        return finalPrice;
    }
}