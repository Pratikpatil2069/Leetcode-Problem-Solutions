class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        int candidates[]=new int[9];
        for(int i=1;i<=9;i++){
            candidates[i-1]=i;
        }
        combinationSum(0,n,new ArrayList<Integer>(),ans,candidates,k);
        return ans;  
    }
    private void combinationSum(int ind, int target,ArrayList<Integer>list,List<List<Integer>>ans,int []candidates,int size){
        if(target==0 && list.size()==size){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1]){
                continue;
            }
            if(target<candidates[i] || list.size()>size){
                break;
            }
            list.add(candidates[i]);
            combinationSum(i+1,target-candidates[i],list,ans,candidates,size);
            list.remove(list.size()-1);
        }
            
    }
}