class Solution {
    public int[] processQueries(int[] queries, int m) {
        int arr[]=new int[queries.length];
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=m;i++){
            list.add(i);
        }
        for(int i=0;i<queries.length;i++){
            int num=queries[i];
            for(int j=0;j<list.size();j++){
                if(num==list.get(j)){
                    arr[i]=j;
                    list.remove(j);
                    list.add(0,num);
                    break;
                }
            }
        }
        return arr;
    }
}