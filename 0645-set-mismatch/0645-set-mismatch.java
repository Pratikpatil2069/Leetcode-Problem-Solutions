class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]=new int[2];
    
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        Set<Integer>set=map.keySet();
        for(Integer key:set){
            if(map.get(key)>1){
                arr[0]=key;
                break;
            }
        }
       for(int i=1;i<nums.length+1;i++){
        if(!(map.containsKey(i))){
            arr[1]=i;
            break;
        }
       }
        
        return arr;
    }
}