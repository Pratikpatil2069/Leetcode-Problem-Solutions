class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int ans=0;
        Arrays.sort(lights);
         for(int i=0;i<arrivalTime.length;i++){
             int r=arrivalTime[i]%period;
             int time=period-r;
                 if(r<lights[lights.length-1]){
                     time=0;
                 }
             
             ans=Math.max(ans,time);
         }   
        return ans;
    }
}