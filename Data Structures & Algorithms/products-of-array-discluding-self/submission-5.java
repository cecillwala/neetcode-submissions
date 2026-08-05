class Solution {
    public int[] productExceptSelf(int[] nums) {

        int left[] = new int[nums.length];
        int prodl = 1;
        left[0] = 1;

        for(int i = 1; i < nums.length; i++){
            prodl *= nums[i - 1];
            left[i] = prodl;
        }

        int right[] = new int[nums.length];
        int prodR = 1;
        right[nums.length - 1] = prodR;

        for(int i = nums.length - 2; i >= 0; i--){
            prodR *= nums[i + 1];
            right[i] = prodR;
        }


        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i ++){
            answer[i] = left[i] * right[i];
        }
        
        return answer;
    }
}  
