class Solution {
    public int minOperations(List<Integer> nums, int k) {
       HashSet<Integer>set=new HashSet<>();
       for(int i=1;i<=k;i++){
        set.add(i);
       }
       
       for(int i=nums.size()-1;i>=0;i--){
        if(set.contains(nums.get(i))){
            set.remove(nums.get(i));
        }
        if(set.isEmpty()){
            return nums.size()-i;
        }
       }
       return -1;
    }
}