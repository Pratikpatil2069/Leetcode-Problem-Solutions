class Solution {
    public int triangularSum(int[] nums) {
       int size=nums.length;

       ArrayList<Integer>list=new ArrayList<>();

       for(int i=0;i<nums.length;i++){
        list.add(nums[i]);
       }

       for(int i=0;i<size-1;i++){
        for(int j=0;j<list.size()-1;j++){
            list.set(j,(list.get(j)+list.get(j+1))%10);
        }
        list.remove(list.size()-1);

       } 
       return list.get(0);
    }
}