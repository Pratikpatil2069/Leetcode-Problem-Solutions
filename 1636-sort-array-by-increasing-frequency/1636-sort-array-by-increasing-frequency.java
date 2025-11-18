class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int []>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int a[],int b[]){
               if(a[1]==b[1]){
                    return b[0]-a[0];
                }else{
                    return a[1]-b[1];
                }
            }
        });
        for(int key:map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }
        int ind=0;
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            for(int i=0;i<arr[1];i++){
                nums[ind++]=arr[0];
            }
        }
        return nums;
    }
}