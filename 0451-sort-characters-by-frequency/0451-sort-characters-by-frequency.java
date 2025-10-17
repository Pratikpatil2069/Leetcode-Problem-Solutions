class Solution {
    class pair{
        char key;
        int fre;
        pair(int fre,char key){
            this.key=key;
            this.fre=fre;
        }

    }
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<pair>pq=new PriorityQueue(new Comparator<pair>(){
            public int compare(pair a,pair b){
               return b.fre-a.fre;
            }

        });
        for(Character key:map.keySet()){
            pq.add(new pair(map.get(key),key));
        }
        while(!pq.isEmpty()){
            pair p=pq.poll();
            for (int i = 0; i < p.fre; i++) {
                sb.append(p.key);
            }
           
        }
        return sb.toString();
    }
}