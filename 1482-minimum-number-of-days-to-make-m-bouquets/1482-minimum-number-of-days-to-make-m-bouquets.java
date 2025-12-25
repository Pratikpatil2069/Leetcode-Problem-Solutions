class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        while(min<=max){
            int mid=min+(max-min)/2;
            if(isbloomDay(bloomDay,m,k,mid)){
                max=mid-1;
                ans=mid;
            }else{
                min=mid+1;
            }
        }
        return ans;
    }
    private boolean isbloomDay(int arr[],int m,int k,int mid){
        int f=0;
        int g=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                f++;
                if(f==k){
                    g++;
                    f=0;
                }
            }else{
                f=0;
            }
        }
        return g>=m;
    }
}