class Solution {
    public int trap(int[] height) {

        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int totalVolume = 0;
        int left = 0;
        leftMax[0] = left;
        for(int i = 1; i < height.length; i++){
            left = Math.max(left, height[i - 1]);
            leftMax[i] = left;
        }

        int right = 0;
        rightMax[height.length - 1] = right;
        for(int i = height.length - 2; i >= 0; i--){
            right = Math.max(right, height[i + 1]);
            rightMax[i] = right;
        }


        for(int i = 0; i < height.length; i++){
            int vol = Math.min(leftMax[i], rightMax[i]) - height[i];
            if(vol > 0){
                totalVolume += vol;
            }
        }

        return totalVolume;
        
    }
}
