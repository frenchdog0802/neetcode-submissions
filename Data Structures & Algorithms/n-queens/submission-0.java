class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backtrack(result, board, 0);
        return result;
    }

    private void backtrack(List<List<String>> result, char[][] board, int index) {
        if (index == board.length) {
            List<String> copy = new ArrayList<>();
            for (char[] row : board) {
                copy.add(new String(row));
            }

            result.add(copy);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(index, i, board)) {
                board[index][i] = 'Q';
                backtrack(result, board, index + 1);
                board[index][i] = '.';
            }
        }
    }

    private boolean isSafe(int r, int c, char[][] board) {
        for (int i = r - 1; i >= 0; i--) {
            if (board[i][c] == 'Q')
                return false;
        }
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        for (int i = r - 1, j = c + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }
}
