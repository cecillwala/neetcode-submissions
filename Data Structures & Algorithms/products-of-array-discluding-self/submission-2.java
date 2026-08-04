class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int prodL = 1;
        left[0] = prodL;
        for(int i = 1; i < nums.length; i++){
            prodL *= nums[i - 1];
            left[i] = prodL;
        }

        int[] right = new int[nums.length];
        int prodR = 1;
        right[nums.length -1] = prodR;
        for(int i = (nums.length - 2); i >= 0; i--){
            prodR *= nums[i + 1];
            right[i] = prodR;
        }

        int[] answers = new int[nums.length];

        for(int i = 0; i < nums.length;i++){
            answers[i] = left[i] * right[i];
        }

        return answers;
    }
}  
