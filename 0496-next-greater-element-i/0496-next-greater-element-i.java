class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums2.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            int num=nums2[i];
            while(!stack.isEmpty() && num>stack.peek()){
                stack.pop();
            }

            if(stack.isEmpty()){
                arr[i]=-1;
            }else{
                arr[i]=stack.peek();
            }
            stack.push(num);
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    nums1[i]=arr[j];
                    break;
                }
            }
        }
       return nums1;
    }
}