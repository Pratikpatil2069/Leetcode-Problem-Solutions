class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<A.length;i++){
            set.add(A[i]);
            int count=0;
            for(int j=0;j<=i;j++){
                if(set.contains(B[j])){
                    count++;
                }
            }
            A[i]=count;
        }
        return A;
    }
}