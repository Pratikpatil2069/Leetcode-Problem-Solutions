class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);
       int left1=0;
       int left2=0;
       int count=0;
       while(left1<s.length && left2<g.length){
        if(s[left1]>=g[left2]){
            count++;
            left1++;
            left2++;
        }else{
            left1++;
        }
       }
       return count;
    }
}