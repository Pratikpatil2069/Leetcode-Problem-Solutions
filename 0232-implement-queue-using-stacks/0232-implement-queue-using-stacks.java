class MyQueue {
    ArrayList<Integer>stack1;
    ArrayList<Integer>stack2;
 
    public MyQueue() {
        this.stack1=new ArrayList<>();
        this.stack2=new ArrayList<>();
    
    }
    
    public void push(int x) {
        stack1.add(x);
      
    }
    
    public int pop() {
      
        for(int i=stack1.size()-1;i>0;i--){
            stack2.add(stack1.remove(stack1.size()-1));
        }
        int num= stack1.remove(0);
        for(int i=stack2.size()-1;i>=0;i--){
            stack1.add(stack2.remove(stack2.size()-1));
        }
        return num;
        
        
    }
    
    public int peek() {
         for(int i=stack1.size()-1;i>0;i--){
            stack2.add(stack1.remove(stack1.size()-1));
        }
        int num= stack1.remove(0);
        stack2.add(num);
        for(int i=stack2.size()-1;i>=0;i--){
            stack1.add(stack2.remove(stack2.size()-1));
        }
        return num;
    }
    
    public boolean empty() {
        if(stack1.size()==0){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */