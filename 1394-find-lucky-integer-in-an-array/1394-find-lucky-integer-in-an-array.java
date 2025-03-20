class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer>set=map.keySet();

        
        int max=-1;
        
        for(Integer key:set){
          
            if(map.get(key)==key){
                max=Math.max(key,max);
                
            }
        }
        return max;
    }
}