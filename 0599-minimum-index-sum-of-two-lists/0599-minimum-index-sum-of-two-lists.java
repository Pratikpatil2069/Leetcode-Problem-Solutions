class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    map.put(list1[i],i+j);
                }
            }
        }
        Set<String>set=map.keySet();
        int min=Integer.MAX_VALUE;
        for(String key:set){
            min=Math.min(min,map.get(key));
        }
        for(String key:set){
            if(map.get(key)==min){
                list.add(key);
            }
        }
        String arr[]=new String[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}