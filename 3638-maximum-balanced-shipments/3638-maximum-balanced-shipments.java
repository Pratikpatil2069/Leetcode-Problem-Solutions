class Solution {
    public int maxBalancedShipments(int[] weight) {
        int shipments=0;
        int max=weight[0];
        for(int i=0;i<weight.length-1;i++){
            max=Math.max(weight[i],max);
            if(weight[i]>weight[i+1] && max>weight[i+1]){
                shipments++;
                i++;
                max=Integer.MIN_VALUE;
            }

        }
        return shipments;
    }
}