class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<strs.size(); i++){
            int length = strs.get(i).length();
            //int length = strs.length(i); //5
            char separator = '#';//#
            //sb.append(length).append(separator);
            //sb.append(strs[i])
            sb.append(length);
            sb.append(separator);
            sb.append(strs.get(i));
        }
        return sb.toString();   //[5#Hello5#World]
    }
    //reverse the process
    public List<String> decode(String str) {

        //find the number of characters
        List<String> result = new ArrayList<>();
        int i=0;
       // int j=0;
        while (i < str.length()){ //with each iteration, we have no idea how long the word would be
            int j = i; // causes the pointer to skip over the word, so we dont iterate over that word
            while (str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j+1;
            j = i+length;
            result.add(str.substring(i,j));
            i=j;
        }
        return result;
    }
}
