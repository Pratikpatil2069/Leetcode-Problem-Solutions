class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        ArrayList<Integer>list=new ArrayList<>();
         for(Integer key:nums2){
            if(set.contains(key)){
                list.add(key);
                set.remove(key);
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}