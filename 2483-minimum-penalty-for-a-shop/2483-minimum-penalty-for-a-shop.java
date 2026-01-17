class Solution {
    public int bestClosingTime(String customers) {
        int prefix[] = new int[customers.length()+1];
        int suffix[] = new int[customers.length()+1];
       

        for (int i = 1; i <=customers.length(); i++) {
            if (customers.charAt(i-1) == 'N') {
                prefix[i] = prefix[i - 1] + 1;
            } else {
                prefix[i] = prefix[i - 1];
            }
            if (customers.charAt(customers.length()  - i) == 'Y') {
                suffix[customers.length()  - i] = suffix[customers.length() - i+1] + 1;
            } else {
                suffix[customers.length() - i] = suffix[customers.length()  - i+1];
            }
        }
        int ind=-1;
        int penalty=Integer.MAX_VALUE;
        for(int i=0;i<=customers.length();i++){
            if(prefix[i]+suffix[i]<penalty){
                penalty=prefix[i]+suffix[i];
                ind=i;
            }
        }
        return ind;
    }
}