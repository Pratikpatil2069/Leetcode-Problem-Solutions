class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer>set=map.keySet();
        for(int i:set){
            int num=map.get(i);
            if(num!=1){
                 boolean flag=true;
            for(int j=2;j<=Math.sqrt(num);j++){
                if(num%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return true;
            }
            }
           
        }
     return false;   
    }
}