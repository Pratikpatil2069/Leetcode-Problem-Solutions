class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int left=0;
            int right=image.length-1;
            while(left<right){
                int num1=image[i][left];
                int num2=image[i][right];
                if(num1==0){
                    num1=1;
                }else{
                    num1=0;
                }
                if(num2==0){
                    num2=1;
                }else{
                    num2=0;
                }
                image[i][left]=num2;
                image[i][right]=num1;
                left++;
                right--;
            }
        }
        if(image.length%2==1){
        for(int i=0;i<image.length;i++){
            if(image[i][image.length/2]==0){
                image[i][image.length/2]=1;
            }else{
                image[i][image.length/2]=0;
            }
        }
        }
        return image;
    }
}