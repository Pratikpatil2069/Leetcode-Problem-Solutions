class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]>stack=new Stack<>();
        int ans[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            int temp=temperatures[i];
            int count=0;
            while(!stack.isEmpty() && stack.peek()[0]<=temp){
                count=count+stack.peek()[1];
                stack.pop();
            }
            if(!stack.isEmpty()){
                stack.push(new int[]{temp,count+1});
                ans[i]=count+1;
            }else{
                stack.push(new int[]{temp,0});
                ans[i]=0;
            }
           
        }
        return ans;
        
    }
}