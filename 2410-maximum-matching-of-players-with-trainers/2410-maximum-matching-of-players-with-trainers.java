class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int ind=0;
        int count=0;
        for(int i=0;i<players.length;i++){
            int player1=players[i];
            for(int j=ind;j<trainers.length;j++){
                if(player1<=trainers[j]){
                    count++;
                    ind=j+1;
                    break;
                }
            }
        }
        return count;
    }
}