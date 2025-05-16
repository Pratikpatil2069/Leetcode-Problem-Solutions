class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        TreeSet<Integer>set=new TreeSet<>();
        for(List<Integer> list:nums){
            int num1=list.get(0);
            int num2=list.get(1);
            while(num1!=num2+1){
                set.add(num1);
                num1++;
            }
        }
        return set.size();       
    }
}