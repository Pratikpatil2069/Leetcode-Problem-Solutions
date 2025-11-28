class CustomStack {
    int arr[];
    int ind=0;

    public CustomStack(int maxSize) {
        arr=new int[maxSize];
    }
    
    public void push(int x) {
        if(ind<arr.length){
            arr[ind++]=x;
        }
        
    }
    
    public int pop() {
        if(ind>0){
            return arr[--ind];
        }else{
            return -1;
        }
        
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<ind && i<k;i++){
            arr[i]=arr[i]+val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */