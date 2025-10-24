class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>>list=new ArrayList<>();
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        
        for(int i=0;i<groupSizes.length;i++){
            map.putIfAbsent(groupSizes[i],new ArrayList<>());
            List<Integer>list1=map.get(groupSizes[i]);
            list1.add(i);
            if(map.get(groupSizes[i]).size()>=groupSizes[i]){
                list.add(new ArrayList<>(map.get(groupSizes[i])));
                map.get(groupSizes[i]).clear();
            }
        }
       
        return list;

    }
}