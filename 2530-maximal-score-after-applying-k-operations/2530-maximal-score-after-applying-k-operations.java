class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
     for(int i=0;i<nums.length;i++){
        pq.add(nums[i]);
     }
     long sum=0;
     for(int i=0;i<k;i++){
        int num=pq.poll();
        sum=sum+num;
        if(num%3==0){
            pq.add(num/3);
        }else{
            pq.add((num/3)+1);
        }
     }  
     return sum;
    }
}