class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        for(int i=0;i<nums3.length;i++){
            if(set.contains(nums3[i])){
                list.add(nums3[i]);
                set.remove(nums3[i]);
            }else if(set2.contains(nums3[i])){
                list.add(nums3[i]);
                set2.remove(nums3[i]);
            }
        }
        for(Integer num:set){
            if(set2.contains(num)){
                list.add(num);
            }
        }
        return list;
    }
}