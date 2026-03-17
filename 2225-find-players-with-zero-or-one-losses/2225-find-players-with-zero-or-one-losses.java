class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        TreeSet<Integer>set=new TreeSet<>();
        TreeMap<Integer,Integer>map=new TreeMap<>();
        
        List<List<Integer>>list=new ArrayList<>();

        for(int i=0;i<matches.length;i++){
            set.add(matches[i][0]);
        }
        for(int i=0;i<matches.length;i++){
            
            if(set.contains(matches[i][1])){
                set.remove(matches[i][1]);
            }
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);

        }
        List<Integer>subList=new ArrayList<>();
        for(int key:set){
            subList.add(key);
        }
        list.add(subList);
        List<Integer>subList1=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==1){
                subList1.add(key);
            }
            
        }
        list.add(subList1);
        
        return list;

        
    }
}