class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String>list=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<dictionary.length;j++){
                if(isEqual(queries[i],dictionary[j])){
                    list.add(queries[i]);
                    break;
                }
            }
        }
        return list;
    }
    public boolean isEqual(String str,String s){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=s.charAt(i)){
                if(count>=2){
                    return false;
                }
                count++;
            }
        }
        return true;
    }
}