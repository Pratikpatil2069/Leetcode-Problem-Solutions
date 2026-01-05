class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer>map=new HashMap<>();
        List<String>list=new ArrayList<>();
        for(int i=0;i<cpdomains.length;i++){
            
            StringBuilder sb=new StringBuilder(cpdomains[i]);
            int ind=0;
            for(int j=0;j<sb.length();j++){
                char ch=sb.charAt(j);
                if(!Character.isLetter(ch)){
                    ind++;
                }else{
                    break;
                }
            }
            int num=Integer.parseInt(sb.substring(0,ind-1));
           
            sb.delete(0,ind);
            
            String[] arr = sb.toString().split("\\.");
            String newString="";
            for(int k=arr.length-1;k>=0;k--){
                newString=arr[k]+(newString.isEmpty()
?"":".")+newString;
                map.put(newString,map.getOrDefault(newString,0)+num);
            }
        }
        for(String str:map.keySet()){
            int n=map.get(str);
            String s=n+" ";
            list.add(s+str);

        }
        return list;
    }
}