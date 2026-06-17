class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length;i++){
            int [] count = new int[26];
            for (int j=0; j<strs[i].length(); j++){
                char c = strs[i].charAt(j);
                int asci = c - 'a';
                count[asci]++;
            }
            //converr array to string key "1, 0, 0, 1, 0, 1"
            String key = Arrays.toString(count);

            if (map.containsKey(key)){
                map.get(key).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
