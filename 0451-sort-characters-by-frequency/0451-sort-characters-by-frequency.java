class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<int []>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int a[] ,int b[]){
                return b[1]-a[1];
            }
        });
        for(char key:map.keySet()){
            pq.add(new int[]{(int)key,map.get(key)});
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            char ch=(char)arr[0];
            for(int i=0;i<arr[1];i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}