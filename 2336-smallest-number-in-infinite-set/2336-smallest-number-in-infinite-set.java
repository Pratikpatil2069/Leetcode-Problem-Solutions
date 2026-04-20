class SmallestInfiniteSet {
    int count;
    PriorityQueue<Integer>pq;

    public SmallestInfiniteSet() {
        this.count=1;
        this.pq=new PriorityQueue<>();
    }
    
    public int popSmallest() {
        int num=count;
        if(pq.size()>0){
            if(count<pq.peek()){
                count++;
                return num;
            }else{
                return pq.poll();
            }
            
        }else{
            count++;
            return num;
            
        }
       
        
    }
    
    public void addBack(int num) {
        if(num<count && !pq.contains(num)){
            pq.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */