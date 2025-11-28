class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int ind=0;
        int can=capacity;
        while(true){
            if(plants[ind]<=can){
                count++;
                can=can-plants[ind];
                ind++;
                if(ind==plants.length){
                    break;
                }  
            }
            
            if(plants[ind]>can){
                count=count+ind;
                count=count+ind;
                can=capacity;
            }
        }
        return count;
    }
}