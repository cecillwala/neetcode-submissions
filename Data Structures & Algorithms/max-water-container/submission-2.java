class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right){
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int product = height * width;
            maxArea = Math.max(maxArea, product);

            if(heights[left] > heights[right]){
                right--;
            }
            else{
                left++;
            }
        }

        return maxArea;
    }
}
