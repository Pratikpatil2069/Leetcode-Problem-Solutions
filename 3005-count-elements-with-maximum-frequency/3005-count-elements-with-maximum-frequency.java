class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer>set=map.keySet();
        int max=Integer.MIN_VALUE;
        int count=1;
        for(Integer key:set){
            if(map.get(key)>max){
                max=map.get(key);
                count=1;
            }else if(map.get(key)==max){
                count++;
            } 
        }
        return count*max;
        
    }
}