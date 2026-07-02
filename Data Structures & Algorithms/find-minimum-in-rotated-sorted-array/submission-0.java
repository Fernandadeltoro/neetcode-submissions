class Solution {
    public int findMin(int[] nums) {
       int left = 0;
       int right = nums.length-1;

       while(left< right){

        int middle = left + (right-left)/ 2;
        int value = nums[middle];
        System.out.println("middle: " + value);

        if (value > nums[right]){
            //value = nums[middle + 1];
            left = middle + 1;
        } else if (value <= nums[right]){
            right = middle;
        } 
       }
       return nums[left];
    
    }
}
