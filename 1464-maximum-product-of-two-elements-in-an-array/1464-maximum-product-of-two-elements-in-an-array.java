class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int num1=pq.poll()-1;
        int num2=pq.poll()-1;
        return num1*num2;

        
    }
}