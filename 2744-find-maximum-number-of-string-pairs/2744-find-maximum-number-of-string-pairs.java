class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                StringBuilder sb=new StringBuilder();
                sb.append(words[j]);
                sb.reverse();
                String s=sb.toString();
                
                if(words[i].equals(s)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}