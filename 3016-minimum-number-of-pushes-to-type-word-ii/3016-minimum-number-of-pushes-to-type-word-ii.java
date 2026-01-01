class Solution {
    public int minimumPushes(String word) {
        PriorityQueue<int []>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int []a,int []b){
                return b[1]-a[1];
            }
        });
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        for(char ch:map.keySet()){
            pq.add(new int[]{ch,map.get(ch)});
        }
        int count=0;
        int keys=0;
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            int fre=keys/8+1;
            count+=fre*arr[1];
            keys++;
        }
        return count;
    }
}