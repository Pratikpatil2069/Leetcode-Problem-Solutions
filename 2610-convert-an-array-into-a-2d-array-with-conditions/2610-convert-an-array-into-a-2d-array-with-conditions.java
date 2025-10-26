class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        while(!map.isEmpty()){
            List<Integer>list1=new ArrayList<>();
            List<Integer>toRemove=new ArrayList<>();
            for(Integer key:map.keySet()){
                list1.add(key);
                map.put(key,map.get(key)-1);
                if(map.get(key)==0){
                    toRemove.add(key);
                }
            }
            for(Integer key:toRemove){
                map.remove(key);
            }
            list.add(list1);
        }
        return list;
    }
}