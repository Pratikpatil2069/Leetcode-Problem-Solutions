class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer>set=map.keySet();
        PriorityQueue<int[]>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int a[],int b[]){
                return b[1]-a[1];
            }
        });
        for(Integer key:set){
            pq.add(new int[]{key,map.get(key)});
        }
        int arr[]=new int[k];
        for(int i=0;i<arr.length;i++){
            int a[]=pq.poll();
            arr[i]=a[0];
        }
       return arr;
    }
}