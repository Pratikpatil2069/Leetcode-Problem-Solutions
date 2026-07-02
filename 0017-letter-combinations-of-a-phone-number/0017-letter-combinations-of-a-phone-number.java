class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>list=new ArrayList<>();
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        Combination(0,digits, "",list,arr);
        return list;
    }
    private void Combination(int i,String digits,String ans,List<String> list,String[] arr){
        if(i==digits.length()){
            list.add(ans);
            return;
        }
        int ind=digits.charAt(i)-'0';
        String s=arr[ind];
        for(int j=0;j<s.length();j++){
            Combination(i+1,digits,ans+s.charAt(j),list,arr);
        }
    }
}