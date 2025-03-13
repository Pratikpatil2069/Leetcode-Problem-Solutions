class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<Integer,String> map=new HashMap<>();
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            int flag=0;
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                if(arr[i].equals(arr[j])){
                    flag=1;
                }
            }
            if(flag==0){
                map.put(count,arr[i]);
                count++;
            }
        }
        int flag1=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[arr.length-1].equals(arr[i])){
                flag1=1;
            }
        }
        if(flag1==0){
            map.put(count,arr[arr.length-1]);
        }
        if(map.size()>=k){
            return map.get(k);

        }else{
            return "";
        }
        
    }
}