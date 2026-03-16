class Solution {
    public int longestOnes(int[] nums, int k) {
        if(k == 0){
            int max = 0, count = 0;
            for(int num : nums){
                if(num == 1){
                    count++;
                    max = Math.max(max, count);
                }else{
                    count = 0;
                }
            }
            return max;
        }
        int max=0;
        int count=0;
        int lastInd=0;
        ArrayList<Integer>list=new ArrayList<>();       
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(count==k){
                    max=Math.max(max,i-lastInd);
                    count--;
                    if(list.size()>0){
                        lastInd=list.remove(0)+1;
                    }
                   
                }
                count++;
                list.add(i);
                
            }
        }
        max=Math.max(max,nums.length-lastInd);
        return max;
    }
}