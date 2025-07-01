class MyHashMap {
    private int []arr;
    private ArrayList<Integer>list;
    public MyHashMap() {
        arr=new int[1000001];
        list=new ArrayList<>();
    }
    
    public void put(int key, int value) {
        arr[key]=value;
        if(value==0){
            list.add(key);
        }
        
    }
    
    public int get(int key) {
        return (arr[key]>0 || list.contains(key)) ?arr[key]:-1;
        
    }
    
    public void remove(int key) {
        arr[key]=0;
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */