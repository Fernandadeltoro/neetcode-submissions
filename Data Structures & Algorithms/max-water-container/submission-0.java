class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right = heights.length -1;
        int max_water = 0;
        while (left < right){
            int current_water = Math.min(heights[left], heights[right]) * (right-left);
            max_water = Math.max(current_water, max_water);
            if (heights[left] < heights[right]){
                left++;
            } else {
                right--;
            }
        }
        return max_water;
    }
}
