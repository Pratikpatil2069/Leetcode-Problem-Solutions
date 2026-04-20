class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        int num1=num;
        ArrayList<Integer>list=new ArrayList<>();
        while(num1>0){
            int re=num1%10;
            if(re%2==0){
                list.add(0,0);
            }else{
                list.add(0,1);
            }
            pq.add(re);
            num1/=10;
        }
       
        int oddInd=-1;
        int evenInd=-1;
        while(!pq.isEmpty()){
            int val=pq.poll();
            if(val%2==0){
                for(int i=evenInd+1;i<list.size();i++){
                    if(list.get(i)==0){
                        list.set(i,val);
                        evenInd=i;
                        break;
                    }
                }

            }else{
                for(int i=oddInd+1;i<list.size();i++){
                    if(list.get(i)==1){
                        list.set(i,val);
                        oddInd=i;
                        break;
                    }
                }

            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum=sum*10+list.get(i);
        }
        return sum;
        
    }
}