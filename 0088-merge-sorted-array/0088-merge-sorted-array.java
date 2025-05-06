class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        PriorityQueue<Integer>queue=new PriorityQueue<>(new Comparator<>(){
            public int compare(Integer a,Integer b){
                return a-b;
            }
        });
        for(int i=0;i<m;i++){
            queue.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            queue.add(nums2[i]);
        }
        int ind=0;

        while(!queue.isEmpty()){
            nums1[ind]=queue.poll();
            ind++;
        }
        
    }
}