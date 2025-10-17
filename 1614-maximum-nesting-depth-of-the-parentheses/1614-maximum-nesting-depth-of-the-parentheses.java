class Solution {
    public int maxDepth(String s) {
        Stack<Character>st=new Stack<>();
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!st.isEmpty()){
                    count=0;
                }
                st.push(s.charAt(i));
            }

            if(ch==')'){
                st.pop();
                count++;
                if(st.isEmpty()){
                    max=Math.max(max,count);
                    count=0;
                }
            }
            
        }
        return max;
    }
}