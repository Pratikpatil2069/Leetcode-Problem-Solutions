class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid.length;j++){
            map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
        }
       }   
       int nums[]=new int[2];
       Set<Integer>set=map.keySet();
       for(Integer key:set){
        if(map.get(key)==2){
            nums[0]=key;
            break;
        }
       } 
       int n=grid.length*grid.length;
       for(int i=1;i<=n;i++){
        if(!(map.containsKey(i))){
            nums[1]=i;
            break;
        }
       } 
       return nums;   
    }
}