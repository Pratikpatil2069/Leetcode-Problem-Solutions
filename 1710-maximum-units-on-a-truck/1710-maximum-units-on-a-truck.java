class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<boxTypes.length;i++){
            pq.add(boxTypes[i]);
        }
        int count=0;
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            if(truckSize>=arr[0]){
                truckSize-=arr[0];
                count+=arr[0]*arr[1];
            }else{
                count+=truckSize*arr[1];
                break;
            }

        }
        return count;
    }
}