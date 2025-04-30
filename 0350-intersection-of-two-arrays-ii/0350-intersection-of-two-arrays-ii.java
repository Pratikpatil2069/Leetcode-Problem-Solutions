class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int e:nums1){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(int e:nums2){
            if(map.containsKey(e)){
                list.add(e);
                map.put(e,map.get(e)-1);
                if(map.get(e)==0){
                    map.remove(e);
                }
            }
        }
        int[]res=new int[list.size()];
        int i=0;
        for(int e:list){
            res[i++]=e;
        }
        return res;
    }
}