class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=9;i++){
            lexicalOrder1(n,i,list);
        }
        
        return list;
    }
    private void lexicalOrder1(int n,int num,ArrayList<Integer>list){
        if(num>n){
            return;
        }
        list.add(num);
        num*=10;
        for(int i=0;i<=9;i++){
            lexicalOrder1(n,num+i,list);
        }
       
    }
}