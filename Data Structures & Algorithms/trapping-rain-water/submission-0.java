class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int current_water = 0;
        int total_water = 0;
        int left_max = 0;
        int right_max= 0;
        
        while (left < right){
            //look at values, not indices
            left_max = Math.max(height[left], left_max);
            right_max = Math.max(height[right], right_max);

            if (left_max < right_max){
                current_water = left_max - height[left];
                total_water += current_water;
                left++;
            } else {
                current_water = right_max - height[right];
                total_water += current_water;
                right--;
            }
            
        }
        return total_water;
    }
}
