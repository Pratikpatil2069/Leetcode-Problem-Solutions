class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            ArrayList<Integer>list1=new ArrayList<>();
            for(int j=l[i];j<=r[i];j++){
                list1.add(nums[j]);
            }
           
            list.add(isArithmetic(list1));
           
        }
        return list;
    }
    public boolean isArithmetic(ArrayList<Integer>list){
        Collections.sort(list);
        int dif=list.get(1)-list.get(0);
        for(int i=0;i<list.size()-1;i++){
            if((list.get(i+1)-list.get(i))!=dif){
                return false;
            }
        }
        return true;
    }
}