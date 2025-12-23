class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        int sum=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
            sum+=piles[i];
        }
        int left=1;
        int right=max;
        while(left<=right){
            int mid=left+(right-left)/2;
            long total=0;
            for(int i=0;i<piles.length;i++){
                int count=(piles[i]/mid)+((piles[i]%mid==0)?0:1);
                total+=count;
            }
           
            if(total>h){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;   
    }
}