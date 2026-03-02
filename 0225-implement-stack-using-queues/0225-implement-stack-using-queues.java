class MyStack {
    ArrayList<Integer>list;

    public MyStack() {
        list=new ArrayList<>();
    }
    
    public void push(int x) {
        list.add(0,x);
    }
    
    public int pop() {
        int size=list.size();
        if(size==0){
            return -1;
        }else{
            for(int i=0;i<size-1;i++){
                int num=list.remove(list.size()-1);
                list.add(0,num);
            }
            return list.remove(list.size()-1);
        }
    }
    
    public int top() {
        int size=list.size();
        if(size==0){
            return -1;
        }else{
            for(int i=0;i<size-1;i++){
                int num=list.remove(list.size()-1);
                list.add(0,num);
            }
            int num1= list.remove(list.size()-1);
            list.add(0,num1);
            return num1;
        }
    }
    
    public boolean empty() {
        if(list.size()==0){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */