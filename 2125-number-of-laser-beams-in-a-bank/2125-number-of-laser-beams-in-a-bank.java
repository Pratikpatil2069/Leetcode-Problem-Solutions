class Solution {
    public int numberOfBeams(String[] bank) {
        int laserBeam=0;
        int count=bank[0].replace("0","").length();
        for(int i=1;i<bank.length;i++){
            int num=bank[i].replace("0","").length();
            if(num!=0){
                laserBeam+=(count*num);
                count=num;
            }
            
        }
        return laserBeam;
    }
}