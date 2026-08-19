class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];

        // Compute an array for the left product of every element in the array
        int prodL = 1;
        leftArr[0] = prodL;
        for(int i = 1; i < nums.length; i++){
            
            prodL = nums[i - 1] * prodL;
            leftArr[i] = prodL;
        }

        // Compute an array for the right product of every element in the array
        int prodR = 1;
        rightArr[nums.length - 1] = prodR;
        for(int i = nums.length - 2; i >= 0; i--){
            prodR = prodR * nums[i + 1];
            rightArr[i] = prodR;
        }

        // Multiply left and right product for each element in the array
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            output[i] = leftArr[i] * rightArr[i];
        }

        return output;
    }
}  
