class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int arr[]=new int[deck.length];
        Arrays.sort(deck);
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            queue.add(i);
        }
        int ind=0;
        while(!queue.isEmpty()){
            arr[queue.poll()]=deck[ind++];
            if(queue.size()>0){
                int index=queue.poll();
                queue.add(index);
            }
            
        }
        return arr;
    }
}