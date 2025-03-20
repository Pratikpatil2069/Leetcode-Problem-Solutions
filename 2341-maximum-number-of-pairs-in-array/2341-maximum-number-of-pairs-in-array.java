class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer>set=map.keySet();
        int count=0;
        int count1=0;
        for(Integer key:set){
            if(map.get(key)%2==0){
                count=count+map.get(key)/2;
            }else if(map.get(key)%2==1 && map.get(key)!=1){
                count=count+map.get(key)/2;
                count1++;
            }
        }
        return new int[]{count,count1+(nums.length-((count*2)+count1))};
    }
}