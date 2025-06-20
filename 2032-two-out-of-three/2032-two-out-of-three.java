class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        Set<Integer>set3=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
          for(int i=0;i<nums3.length;i++){
            set3.add(nums3[i]);
        }
        HashMap<Integer,Integer>map=new HashMap<>();
       for(Integer num:set){
        map.put(num,map.getOrDefault(num,0)+1);
       }
        for(Integer num:set2){
        map.put(num,map.getOrDefault(num,0)+1);
       }
        for(Integer num:set3){
        map.put(num,map.getOrDefault(num,0)+1);
       }
       Set<Integer>set4=map.keySet();
        for(Integer num:set4){
           if(map.get(num)>=2){
            list.add(num);
           }
        }
        return list;
    }
}