class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int half=arr.length/2;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<int []>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int []a, int []b){
                return b[1]-a[1];
            }
        });
        for(int key:map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }
        int size=pq.size();
        int count=0;
        while(!pq.isEmpty()){
            int arr1[]=pq.poll();
            count+=arr1[1];
            if(count>=half){
                break;
            }
        }

        return size-pq.size();
    }
}