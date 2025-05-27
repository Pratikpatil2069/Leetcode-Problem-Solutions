class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        int n=tickets[k];
        int ind=-1;
        for(int i=0;i<k;i++){
            if(tickets[i]==n){
                ind=i;
                break;
            }
        }
        ArrayDeque<Integer>q=new ArrayDeque<>();
        ArrayDeque<Integer>p=new ArrayDeque<>();

        for(int i=0;i<tickets.length;i++){
            q.addLast(tickets[i]);
            p.addLast(i);
        }
        
        while(n!=0){
            count++;
            int num=q.pollFirst();
            int p1=p.pollFirst();
            if(k==p1){
                n--;
            }
            num--;
            if(num!=0){
                q.addLast(num);
                p.addLast(p1);
            }
            

        }
      return count;    
    }
}