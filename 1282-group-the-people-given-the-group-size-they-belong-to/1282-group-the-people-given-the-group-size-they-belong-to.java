class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<groupSizes.length;i++){
            map.put(i,groupSizes[i]);
        }
        for(int j=0;j<groupSizes.length;j++){
            int val=groupSizes[j];
            List<Integer>list1=new ArrayList<>();
            for(int i=0;i<groupSizes.length;i++){
               if(map.containsKey(i) && map.get(i)==val){
                list1.add(i);
                map.remove(i);
                if(list1.size()>=groupSizes[j]){
                    list.add(list1);
                    break;
                }
               }
            }
        }
        return list;

    }
}