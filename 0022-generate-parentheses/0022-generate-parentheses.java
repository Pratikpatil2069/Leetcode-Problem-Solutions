class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String>list=new ArrayList<>();
        generateParenthesis1(n,1,0,"(",list);
        return list;
    }
    private void generateParenthesis1(int n,int open,int close,String str ,ArrayList<String>list){
        if(open==n && close==n){
            list.add(str);
            return ;    
        }
        if(open>n || close>n){
            return;
        }
        generateParenthesis1(n,open+1,close,str+"(",list);
       
        if(close<open){
            generateParenthesis1(n,open,close+1,str+")",list);
        }

    }
}