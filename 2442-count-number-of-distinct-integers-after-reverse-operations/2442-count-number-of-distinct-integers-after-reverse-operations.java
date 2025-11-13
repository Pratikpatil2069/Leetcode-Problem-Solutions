class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int dup=0;
            while(num>0){
                int re=num%10;
                 dup=dup*10+re;
                num=num/10;
            }
            set.add(dup);
        }
       
        return set.size();
    }
}