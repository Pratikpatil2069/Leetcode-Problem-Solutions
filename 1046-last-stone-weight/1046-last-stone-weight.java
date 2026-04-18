class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(!pq.isEmpty()){
            int y=pq.poll();
            int x=0;
            if(pq.size()<=0){
                return y;
            }else{
                x=pq.poll();
            }
            if(x!=y){
                pq.add(y-x);
            }
        }
        return 0;
    }
}