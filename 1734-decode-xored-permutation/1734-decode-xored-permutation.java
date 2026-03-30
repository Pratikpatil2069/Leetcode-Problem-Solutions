class Solution {
    public int[] decode(int[] encoded) {
        int totalXor=0;
        for(int i=1;i<=encoded.length+1;i++){
            totalXor^=i;
        }
        int oddIndicesXor=0;
        for(int i=1;i<encoded.length;i=i+2){
            oddIndicesXor^=encoded[i];
        }
        int ans[]=new int[encoded.length+1];
        ans[0]=totalXor^oddIndicesXor;
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i-1]^encoded[i-1];
        }
        return ans;
    }
}