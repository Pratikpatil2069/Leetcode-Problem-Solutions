class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<int []>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int a[],int b[]){
                if(a[1]==b[1]){
                    return a[0]-b[0];
                }else{
                    return a[1]-b[1];
                }
            }
        });
        for(int i=0;i<arr.length;i++){
            pq.add(new int[]{arr[i],Integer.bitCount(arr[i])});
        }
        int ind=0;
        while(!pq.isEmpty()){
            int nums[]=pq.poll();
            arr[ind++]=nums[0];
        }
        return arr;
    }
}