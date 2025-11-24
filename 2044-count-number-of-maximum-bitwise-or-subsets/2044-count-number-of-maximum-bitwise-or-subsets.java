class Solution {
    public int countMaxOrSubsets(int[] nums) {
       HashMap<Integer,Integer>map=new HashMap<>();
       List<List<Integer>>list=new ArrayList<>();
       list.add(new ArrayList<>());
       for(int num:nums){
        int size=list.size();
        for(int i=0;i<size;i++){
            List<Integer>list1=new ArrayList<>(list.get(i));
            list1.add(num);
            list.add(list1);
        }
       }
       int max=0;
       for(List<Integer>list1:list){
        int or=0;
        for(int num:list1){
            or|=num;
        }
        map.put(or,map.getOrDefault(or,0)+1);
        max=Math.max(max,or);
       }
       return map.get(max);
    }
}