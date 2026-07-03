class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        fun(nums,new ArrayList<>(),list);
        return list;
    }
    private void fun(int[] nums,ArrayList<Integer>list1,List<List<Integer>>list){
        if(list1.size()==nums.length){
            list.add(new ArrayList<>(list1));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!list1.contains(nums[i])){
                list1.add(nums[i]);
                fun(nums,list1,list);
                list1.remove(list1.size()-1);
            }
        }
        
    }
}