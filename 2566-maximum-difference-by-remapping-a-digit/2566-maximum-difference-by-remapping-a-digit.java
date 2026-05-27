class Solution {
    public int minMaxDifference(int num) {
        String max=""+num;
        String min=""+num;
        if(max.charAt(0)=='9'){
            for(int i=0;i<max.length();i++){
                if(max.charAt(i)!='9'){
                    max=max.replace(max.charAt(i),'9');
                    break;
                }
            }

        }else{
            max=max.replace(max.charAt(0),'9');
        }

        if(min.charAt(0)=='0'){
             for(int i=0;i<min.length();i++){
                if(min.charAt(i)!='0'){
                    min=min.replace(min.charAt(i),'0');
                    break;
                }
            }
        }else{
           min=min.replace(min.charAt(0),'0');
        }
        
        
        return Math.abs(Integer.parseInt(max)-Integer.parseInt(min));

    }
}