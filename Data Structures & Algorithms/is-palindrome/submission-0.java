class Solution {
    public boolean isPalindrome(String s) {
        int left= 0;
        int right= s.length()-1;

        while(left < right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                //while left is not a letter or digit, add one to left to iterate over next one
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            
            //compare characters case-sensitive
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            } 
            left++;
            right--;
        }
        return true;
    }
}
