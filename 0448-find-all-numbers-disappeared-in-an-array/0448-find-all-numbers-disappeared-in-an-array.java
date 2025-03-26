class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],1);
        }
        ArrayList<Integer>list=new ArrayList<>();
       for(int i=1;i<nums.length+1;i++){
        if(!(map.containsKey(i))){
            list.add(i);
        }
       }
        return list;
    }
}