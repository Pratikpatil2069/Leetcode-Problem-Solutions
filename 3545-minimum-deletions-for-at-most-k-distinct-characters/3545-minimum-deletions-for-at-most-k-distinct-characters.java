class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.size()==k){
            return 0;
        }
        int count=map.size()-k;
        int remove=0;
        for(char ch :map.keySet()){
            list.add(map.get(ch));
        }
        Collections.sort(list);
        for(int i=0;i<count;i++){
            remove+=list.get(i);
        }
        return remove;
    }
}