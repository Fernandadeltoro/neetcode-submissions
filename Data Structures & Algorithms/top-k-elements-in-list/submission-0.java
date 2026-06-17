class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            //syntax for code on counting frequencies under
            // a hashmap 
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        //initiziaatingbucketList no larger than the toal size of the input array (n +1)
        List<Integer>[] buckets = new ArrayList[nums.length+1];
        for (int i=0; i<buckets.length; i++){
            buckets[i] = new ArrayList<Integer>();
        }

        //put hash elements into respective buckets 
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
        //for (int i=0; i <map.size(); i++){
            int frequency = entry.getValue(); //this will be the index
            int element = entry.getKey();
            buckets[frequency].add(element);
        }

        
        int [] result = new int[k];
        int index = 0;
        int i = buckets.length -1;
        while (index < k){
            for (int j = 0; j< buckets[i].size(); j++){
                result[index] = buckets[i].get(j);
                index++;
                if (index == k) break;
            }
            i--;
        }
        return result;
    }
}
