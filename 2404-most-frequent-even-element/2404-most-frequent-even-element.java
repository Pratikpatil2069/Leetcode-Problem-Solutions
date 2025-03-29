class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int max=0;
        Set<Integer>set=map.keySet();
        int result=-1;
        for(Integer key:set){
            if(max<map.get(key)){
                max=map.get(key);
                result=key;
            }
        }
        int min=result;
        for(Integer key:set){
            if(map.get(key)==max){
                if(min>key){
                    min=key;
                }
            }
        }
        return result;
    }
}