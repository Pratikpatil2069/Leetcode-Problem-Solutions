class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(canShip(weights,days,mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private boolean canShip(int[]arr,int days,int capacity){
        int daysCount=1;
        int load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>capacity){
                daysCount++;
                load=0;
            }
            load+=arr[i];
        }
        return daysCount<=days;
    }
}