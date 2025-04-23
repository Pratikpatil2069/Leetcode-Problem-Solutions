class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i][0],map.getOrDefault(nums1[i][0],0)+nums1[i][1]);
        }
         for(int i=0;i<nums2.length;i++){
            map.put(nums2[i][0],map.getOrDefault(nums2[i][0],0)+nums2[i][1]);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        Set<Integer>set=map.keySet();
        for(Integer key:set){
            pq.add(key);
        }
        int nums[][]=new int [map.size()][2];
        int index=0;
        while(!pq.isEmpty()){
            nums[index][0]=pq.peek();
            nums[index][1]=map.get(pq.poll());
            index++;
        }
        return nums;
    }
}