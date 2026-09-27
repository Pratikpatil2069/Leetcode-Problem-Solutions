class Solution {
    public int[] rearrangeArray(int[] nums) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans[]=new int[nums.length];
        int ind=0;
        while(map.size()>0){
            Iterator<Integer>it=map.keySet().iterator();
            while(it.hasNext()){
                int key=it.next();
                int fre=map.get(key);
                ans[ind++]=key;
                fre--;
                if(fre==0){
                    it.remove();
                }else{
                    map.replace(key,fre);
                } 
            }
        }
        return ans;
    }
}