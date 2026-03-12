class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character>stack=new Stack<>();
        int arr[]=new int[26];
        boolean visited[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(visited[ch-'a']){
                continue;
            }
            while(!stack.isEmpty() && stack.peek()>ch && arr[stack.peek()-'a']>i){
                visited[stack.pop()-'a']=false;
            }
           stack.push(ch);
           visited[ch-'a']=true;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }
}