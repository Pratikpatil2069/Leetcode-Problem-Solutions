class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }
        for(int i=0;i<k;i++){
            int num=pq.poll();
            pq.add((int)Math.sqrt(num));
        }
        long sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}