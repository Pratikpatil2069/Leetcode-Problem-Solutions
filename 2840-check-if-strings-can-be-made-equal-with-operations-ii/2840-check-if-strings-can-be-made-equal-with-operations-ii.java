class Solution {
    public boolean checkStrings(String s1, String s2) {
       HashMap<Character,List<Integer>>map1=new HashMap<>();
       HashMap<Character,List<Integer>>map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(map1.containsKey(s1.charAt(i))){
                    List<Integer>list=map1.get(s1.charAt(i));
                    list.add(i);
                    map1.put(s1.charAt(i),list);
                }else{
                    List<Integer>list1=new ArrayList<>();
                    list1.add(i);
                    map1.put(s1.charAt(i),list1);
                }

                if(map2.containsKey(s2.charAt(i))){
                    List<Integer>list2=map2.get(s2.charAt(i));
                    list2.add(i);
                    map2.put(s2.charAt(i),list2);
                }else{
                    List<Integer>list3=new ArrayList<>();
                    list3.add(i);
                    map2.put(s2.charAt(i),list3);
                }
               
            }
        }
        for(char key:map1.keySet()){
            List<Integer>l1=map1.get(key);
            if(!map2.containsKey(key)){
                return false;
            }
            List<Integer>l2=map2.get(key);
            if(l1.size()!=l2.size()){
                return false;
            }
            int even=0;
            int odd=0;
            for(int i=0;i<l1.size();i++){
               if(l1.get(i)%2==0){
                even++;
               }else{
                odd++;
               }
                if(l2.get(i)%2==0){
                even--;
               }else{
                odd--;
               }
            }
            if(odd!=0 || even!=0){
                return false;
            }
        }
        return true;
    }
}