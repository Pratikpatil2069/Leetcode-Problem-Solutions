class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum1 = 0;
            int num1 = nums[i];
            while (num1 > 0) {
                sum1 += num1 % 10;
                num1 /= 10;
            }
            if(map.containsKey(sum1)){
                List<Integer>list=map.get(sum1);
                list.add(nums[i]);
            }else{
                ArrayList<Integer> newList=new ArrayList<>();
                newList.add(nums[i]);
                map.put(sum1,newList);
            }
           
        }
            for(int key:map.keySet()){
                List<Integer>list1=map.get(key);
                Collections.sort(list1,Collections.reverseOrder());
                if(list1.size()>1){
                    max=Math.max(max,list1.get(0)+list1.get(1));
                }
                
            }
        return(max==0)?-1:max;
    }
}