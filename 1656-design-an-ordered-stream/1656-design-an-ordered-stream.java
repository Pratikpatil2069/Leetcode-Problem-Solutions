class OrderedStream {
    String arr[];
    int ind;
    public OrderedStream(int n) {
        arr=new String[n];
        ind=0;
    }
    
    public List<String> insert(int idKey, String value) {
        List<String>list=new ArrayList<>();
        arr[idKey-1]=value;
        for(int i=ind;i<arr.length;i++){
            if(arr[i]==null){
                break;
            }
            list.add(arr[i]);
            ind++;
        }
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */