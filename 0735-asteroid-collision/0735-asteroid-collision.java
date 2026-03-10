class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        int ind=0;
        for(int i=0;i<asteroids.length;i++){
            int num=asteroids[i];
            if(num>0){
                stack.push(num);
            }else{
                num=num*-1;
                boolean flag=true;
                while(!stack.isEmpty()){
                    if(stack.peek()<num){
                        stack.pop();
                    }else if(stack.peek()==num){
                        stack.pop();
                        flag=false;
                        break;
                    }else{
                        break;
                    }
                }
                if(stack.isEmpty() && flag){
                    list.add(-num);
                    ind++;
                }
            }
        }
        while(!stack.isEmpty()){
            int val=stack.pop();
            list.add(ind,val);
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}