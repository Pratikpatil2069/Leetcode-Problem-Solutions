class Solution {
    public int longestBalanced(int[] nums) {
        int max=0;
        HashSet<Integer>evenSet=new HashSet<>();
         HashSet<Integer>oddSet=new HashSet<>();
         for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0){
                    evenSet.add(nums[j]);
                }else{
                    oddSet.add(nums[j]);
                }
                if(evenSet.size()==oddSet.size()){
                    max=Math.max(max,(j-i+1));
                }
            }
            oddSet.clear();
            evenSet.clear();
         }
        return max;
        
    }
}