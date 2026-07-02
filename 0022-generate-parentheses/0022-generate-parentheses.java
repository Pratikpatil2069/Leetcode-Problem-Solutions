class Solution {
    public List<String> generateParenthesis(int n) {
        return generateParenthesis1(n,1,0,"(",new ArrayList<String>());
    }
    private ArrayList<String> generateParenthesis1(int n,int open,int close,String str ,ArrayList<String>list){
        if(open==n && close==n){
            list.add(str);
            return list;
        }
        if(open>n || close>n){
            return list;
        }
        list=generateParenthesis1(n,open+1,close,str+"(",list);
       
        if(close<open){
            list=generateParenthesis1(n,open,close+1,str+")",list);
        }
        return list;
    }
}