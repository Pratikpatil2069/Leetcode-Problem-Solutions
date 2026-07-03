class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(candidates);
        fun(0,target,new ArrayList<>(),candidates,list);
        return list;
    }
    private void fun(int ind, int target,List<Integer>ans,int candidates[],List<List<Integer>>list){
        if(target==0){
            list.add(new ArrayList<>(ans));
        }
        for(int i=ind;i<candidates.length;i++){
            if(target>=candidates[i]){
                ans.add(candidates[i]);
                fun(i,target-candidates[i],ans,candidates,list);
                ans.remove(ans.size()-1);
            }
        }
    }
}