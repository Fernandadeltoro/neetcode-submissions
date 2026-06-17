class Solution {
    public boolean isValidSudoku(char[][] board) {
        //valid sudoku code it from memory
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];

        //initialize the indexes of all hashsets firts
        for(int i=0; i<9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i]= new HashSet<>();
        }


        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[i].length; j++){
                if (board[i][j] == '.') {
                    continue;
                }

                if (rows[i].contains(board[i][j])){
                    return false;
                }
                rows[i].add(board[i][j]);
                if (cols[j].contains(board[i][j])){
                    return false;
                }
                cols[j].add(board[i][j]);

                //find index of each square in the box
                int index = (i/3) * 3 + (j/3);
                if (box[index].contains(board[i][j])){
                   return false;
                }
                box[index].add(board[i][j]);

            }
        }
        return true;
    }
}