class Solution {
    public int[] minCosts(int[] cost) {
        int min=cost[0];
        for(int i=1;i<cost.length;i++){
            if(min<=cost[i]){
                cost[i]=min;
            }else{
                min=cost[i];
                cost[i]=min;
            }
        }
        return cost;
    }
}