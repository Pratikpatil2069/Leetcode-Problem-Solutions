class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();

        if(numRows==1){
            ArrayList<Integer>list1=new ArrayList<>();
            list1.add(1);
            list.add(list1);
            return list;
        }else if(numRows==2){
            ArrayList<Integer>list1=new ArrayList<>();
            ArrayList<Integer>list2=new ArrayList<>();
            list1.add(1);
            list2.add(1);
            list2.add(1);
            list.add(list1);
            list.add(list2);
            return list;
        }else{
            ArrayList<Integer>list1=new ArrayList<>();
            ArrayList<Integer>list2=new ArrayList<>();
            list1.add(1);
            list2.add(1);
            list2.add(1);
            list.add(list1);
            list.add(list2);
            for(int i=1;i<=numRows-2;i++){
                 ArrayList<Integer>list3=new ArrayList<>();
                 list3.add(1);
                 int sum=0;
                for(int j=0;j<list2.size()-1;j++){
                    sum=sum+list2.get(j);
                    sum+=list2.get(j+1);
                    list3.add(sum);
                    sum=0;
                }
                list3.add(1);
                list.add(list3);
                list2=list3;
            }
            
        }
        return list;
    }
}