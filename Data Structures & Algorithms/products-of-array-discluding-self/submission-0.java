class Solution {
    public int[] productExceptSelf(int[] nums) {
        //declare them outside because then it will delete the progress so far 
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];

        //set base cases before the loop
        prefix[0] = 1; //nothing to the left of index 0
        suffix[n-1] = 1; //nothign to the right of last index

        //one going from left to right
        //prefix sum should start from 1 because in the prefix operation it will crasg
        for (int i=1; i<n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
            //suffix[i] = suffix[i+1] *nums[i+1];
        }
        //sufix should start at n-2, not n (last index is "n-1")
        for (int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] *nums[i+1];
        }

        int result[] = new int[n];
        for (int i=0; i<n; i++){
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}  
