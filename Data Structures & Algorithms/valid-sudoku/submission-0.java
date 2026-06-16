class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char num = board[i][j];
                if('.' != num){
                                    String rowNum = "row" + i + "" + num;
                String colNum = "col" + j + "" + num;
                String block = "block" + j / 3 + "" + i / 3 + "" + num;
                if (set.contains(rowNum) || set.contains(colNum) || set.contains(block)) {
                    return false;
                } else {
                    set.add(rowNum);
                    set.add(colNum);
                    set.add(block);
                }
                }
            }
        }
        return true;
    }
}
