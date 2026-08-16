class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<drones.length;i++){
            int x=drones[i][0];
            int y=drones[i][1];
            int range=drones[i][2];
            int diff=Math.abs(x-target[0])+Math.abs(y-target[1]);
            if(range>=diff){
                if(min>diff){
                  min=diff;
                  ans=i;   
                }
               
            }
            
        }
        return ans;
    }
}