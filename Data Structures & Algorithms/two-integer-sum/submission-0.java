class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i= 0; i<nums.length; i++){
            int newNum = target - nums[i];

            if (map.containsKey(newNum)){
                return new int[]{map.get(newNum), i };
            }
            map.put(nums[i], i); 
        }
        return new int[]{}; 
    }
}
