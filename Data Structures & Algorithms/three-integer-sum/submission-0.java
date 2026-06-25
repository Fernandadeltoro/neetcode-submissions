class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i =0; i<nums.length; i++){
            if (i> 0 && nums[i] == nums[i-1]) continue; //skip duplicates here to avoid starting with same 
            // and makes sure the current i is not the same as the previous
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length-1;
            while (left < right){
                int sum = nums[left] + nums[right];
                if (sum == target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //after recording a valid triplet, advance past any duplicates on both sides
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right -1]) right--;
                    left++;
                    right--;
                } else if (sum < target){
                    left++;
                } else if (sum > target){
                    right--;
                }
            }
        }
        return result;
    }
}
