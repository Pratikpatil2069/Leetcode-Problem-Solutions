class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer>set=map.keySet();
        for(Integer key:set){
            if(map.get(key)==1){
                sum=sum+key;
            }
        }
      return sum;
    }
}