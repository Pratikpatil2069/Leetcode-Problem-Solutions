class Solution {
    public int singleNumber(int[] nums) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(((nums[j]>>i)&1)!=0){
                    count++;
                }
            }
            if(count%3!=0){
                sb.insert(0, '1');
            }else{
                sb.insert(0, '0');
            }
            
        }
        return (int)Long.parseLong(sb.toString(),2);
    }
}