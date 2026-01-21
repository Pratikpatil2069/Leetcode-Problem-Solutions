class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int arr[]=new int[words.length];
        String str="aeiou";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(str.indexOf(s.charAt(0))!=-1 && str.indexOf(s.charAt(s.length()-1))!=-1){
                if(i==0){
                    arr[i]++;
                }else{
                    arr[i]=arr[i-1]+1;
                }
                
            }else{
                if(i!=0){
                    arr[i]=arr[i-1];
                }
            }
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if ( queries[i][0]== 0) {
                ans[i] = arr[queries[i][1]];
            } else {
               ans[i]=arr[queries[i][1]]-arr[queries[i][0]-1];
            }
            
        }
        return ans;
    }
}