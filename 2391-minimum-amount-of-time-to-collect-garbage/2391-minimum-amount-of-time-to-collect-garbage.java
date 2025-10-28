class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int totalTime=0;
        int travelTime=0;

        for(int i=0;i<travel.length;i++){
            travelTime+=travel[i];
        }

        int paperTime=0;
        int paperInd=-1;
        for(int i=0;i<garbage.length;i++){
            String str=garbage[i];
            boolean flag=false;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='P'){
                    paperTime+=1;
                    flag=true;
                }
            }
            if(flag){
                paperInd=i;
            }

        }
        for(int i=0;i<paperInd;i++){
            paperTime+=travel[i];
        }

        
        int metalTime=0;
        int metalInd=-1;
        for(int i=0;i<garbage.length;i++){
            String str=garbage[i];
            boolean flag=false;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='M'){
                    metalTime+=1;
                    flag=true;
                }
            }
            if(flag){
                metalInd=i;
            }   
        }
        for(int i=0;i<metalInd;i++){
            metalTime+=travel[i];
        }

        int glassTime=0;
        int glassInd=-1;
        for(int i=0;i<garbage.length;i++){
            String str=garbage[i];
            boolean flag=false;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='G'){
                    glassTime+=1;
                    flag=true;
                }
            }
            if(flag){
                glassInd=i;
            }   
            
        }
         for(int i=0;i<glassInd;i++){
            glassTime+=travel[i];
        }
        return paperTime+metalTime+glassTime;
    }
}