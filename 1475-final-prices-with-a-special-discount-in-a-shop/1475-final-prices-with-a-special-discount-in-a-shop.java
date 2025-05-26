class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[]=new int [prices.length];
        for(int i=0;i<prices.length-1;i++){
            int num=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(num>=prices[j]){
                    arr[i]=num-prices[j];
                    break;
                }else{
                    arr[i]=num;
                }
            }
        }
        arr[prices.length-1]=prices[prices.length-1];
        return arr;
    }
}