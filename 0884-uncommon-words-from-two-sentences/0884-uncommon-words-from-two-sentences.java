class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        int j=0;
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '){
                list.add(s1.substring(j,i));
                j=i+1;
                
            }
        }
        list.add(s1.substring(j,s1.length()));
         int k=0;
        ArrayList<String>list1=new ArrayList<>();
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)==' '){
                list1.add(s2.substring(k,i));
                k=i+1;
                
            }
        }
        list1.add(s2.substring(k,s2.length()));
        HashMap<String,Integer>map=new HashMap<>();
        list.addAll(list1);
        for(int i=0;i<list.size();i++){
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        ArrayList<String>list2=new ArrayList<>();
        Set<String>set=map.keySet();
        int ind=0;
        for(String key:set){
            if(map.get(key)==1){
                list2.add(key);
            }
        }
        String arr[]=new String[list2.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list2.get(i);
        }
        return arr;
    }
}