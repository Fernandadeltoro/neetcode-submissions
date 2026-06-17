class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            map.add(nums[i]);
        }

        //create an array with the size of the map
        //copy the map's values into the array
        int[] newArray = new int[map.size()];
        int index=0;
        for (int value: map){
            newArray[index] = value;
            index++;
        }

        //check each unique number to see if it starts with a sequence
        int longest =0;
        for (int i=0; i<newArray.length; i++){
            int arrayN = newArray[i];

            //a number only counts as the start of a sequence if no other
            //number in the newarray has num-1
            if (!map.contains(arrayN-1)){
                int length = 1;
                int current = arrayN;
                //while (current != current-1)
                while(map.contains(current + 1 )){
                    current++;
                    length++;
                }
                if (length > longest){
                    longest = length;
                }
            }
        }
        // int starter = 1;
        // int length = 0; 
        // int counter = 0;
        
        return longest;
    }
}
