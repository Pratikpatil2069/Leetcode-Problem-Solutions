class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int arr[]=new int[nums.length-k+1];
        int ind=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        PriorityQueue<int []>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int[]a,int[]b){
                if(a[1]==b[1]){
                    return b[0]-a[0];
                }else{
                    return b[1]-a[1];
                }
            }
        });
        for(int i=0;i<=nums.length-k;i++){
            for(int j=i;j<i+k;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
            Set<Integer>set=map.keySet();
            for(Integer key:set){
                pq.add(new int[]{key,map.get(key)});
            }
            int sum=0;
            for(int l=0;l<x;l++){
                if(pq.isEmpty()){
                    break;
                }
                int []num=pq.poll();
                    sum+=num[0]*num[1];
            }
            arr[ind++]=sum;
            pq.clear();
            map.clear();
        }
        return arr;
    }
}