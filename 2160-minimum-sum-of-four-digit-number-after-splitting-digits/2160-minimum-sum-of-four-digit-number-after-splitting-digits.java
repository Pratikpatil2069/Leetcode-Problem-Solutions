class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer>list=new ArrayList<>();
        int dup=num;
        while(dup>0){
            int re=dup%10;
            if(re!=0){
                list.add(re);
            }
            dup/=10;
        }
        Collections.sort(list);
        int num1=0;
        int num2=0;
        boolean flag=true;
        for(int i=0;i<list.size();i++){
            if(flag){
                num1=num1*10+list.get(i);
                if(list.size()==3){
                    i++;
                    num1=num1*10+list.get(i);
                }
                flag=false;
            }else{
                num2=num2*10+list.get(i);
              
                if(list.size()==4){
                    i++;
                    num2=num2*10+list.get(i);
                }
                flag=true;
            }
        }
        return num1+num2;
    }
}