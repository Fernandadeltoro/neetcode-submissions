class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> tallyS = new HashMap<>();
        Map<Character, Integer> tallyT = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++){
            tallyS.put(s.charAt(i), tallyS.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i< t.length(); i++){
            tallyT.put(t.charAt(i), tallyT.getOrDefault(t.charAt(i), 0)+ 1);
        }
        return tallyS.equals(tallyT);
        
    }
}
