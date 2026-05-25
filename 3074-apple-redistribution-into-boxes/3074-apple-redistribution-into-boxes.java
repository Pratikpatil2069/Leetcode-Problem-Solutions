class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int totalApp=0;
        for(int i=0;i<apple.length;i++){
            totalApp+=apple[i];
        }
        int boxes=0;
        for(int i=capacity.length-1;i>=0;i--){
            totalApp-=capacity[i];
            boxes++;
            if(totalApp<=0){
                return boxes;
            }

        }
        return boxes;
    }
}