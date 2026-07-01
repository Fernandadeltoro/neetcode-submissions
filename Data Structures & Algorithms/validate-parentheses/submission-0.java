class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i< s.length(); i++){
            char curr = s.charAt(i);
            if (map.containsKey(curr)){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(top != map.get(curr)){
                    return false;
                } 
            } else {
                stack.push(curr);
            }
        }
        return stack.isEmpty();
    }
}
