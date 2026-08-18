class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(0,target,new ArrayList<Integer>(),ans,candidates);
        return ans;
        
    }
    private void combinationSum(int ind, int target,ArrayList<Integer>list,List<List<Integer>>ans,int []candidates){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]){
                continue;
            }
            if(target<candidates[i]){
                break;
            }
            list.add(candidates[i]);
            combinationSum(i+1,target-candidates[i],list,ans,candidates);
            list.remove(list.size()-1);
        }
            
    }
}