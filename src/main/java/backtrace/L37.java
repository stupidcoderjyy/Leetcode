package backtrace;

public class L37 {
    char[][] board;

    public void solveSudoku(char[][] board) {
        this.board = board;
        recurse(0, 0);
    }

    private boolean recurse(int r0, int c0) {
        if (r0 == 9 || c0 == 9) {
            return true;
        }
        int c = c0;
        for (int r = r0 ; r < 9 ; r ++) {
            for (; c < 9 ; c ++) {
                if (board[r][c] != '.') {
                    continue;
                }
                for (char num = '1'; num <= '9'; num++) {
                    if (!isValid(r, c, num)) {
                        continue;
                    }
                    board[r][c] = num;
                    boolean find;
                    if (c == 8) {
                        find = recurse(r + 1, 0);
                    } else {
                        find = recurse(r, c + 1);
                    }
                    if (find) {
                        return true;
                    }
                    board[r][c] = '.';
                }
                return false;
            }
            c = 0;
        }
        return true;
    }

    private boolean isValid(int r, int c, char num) {
        for (int i = 0; i < 9; i++) { // 判断行里是否重复
            if (board[r][i] == num) {
                return false;
            }
        }
        for (int j = 0; j < 9; j++) { // 判断列里是否重复
            if (board[j][c] == num) {
                return false;
            }
        }
        int r0 = (r / 3) * 3;
        int c0 = (c / 3) * 3;
        for (int i = r0; i < r0 + 3; i++) { // 判断9方格里是否重复
            for (int j = c0; j < c0 + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
