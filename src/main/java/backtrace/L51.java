package backtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L51 {
    final List<List<String>> result = new ArrayList<>();
    int[] rowData;
    int[] columnData;
    int n;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        this.rowData = new int[n];
        this.columnData = new int[n];
        Arrays.fill(rowData, -1);
        Arrays.fill(columnData, -1);
        recurse(0);
        return result;
    }

    private void recurse(int r) {
        if (r == n) {
            setResult();
            return;
        }
        if (rowData[r] >= 0) {
            return;
        }
        for (int c = 0; c < n ; c++) {
            if (columnData[c] >= 0 || existInDiagonal(r, c)) {
                continue;
            }
            rowData[r] = c;
            columnData[c] = r;
            recurse(r + 1);
            rowData[r] = -1;
            columnData[c] = -1;
        }
    }

    private boolean existInDiagonal(int r, int c) {
        int r0 = r, c0 = c;
        while (r0 >= 0 && c0 >= 0) {
            if (rowData[r0--] == c0--) {
                return true;
            }
        }
        r0 = r;
        c0 = c;
        while (r0 < n && c0 < n) {
            if (rowData[r0++] == c0++) {
                return true;
            }
        }
        r0 = r;
        c0 = c;
        while (r0 >= 0 && c0 < n) {
            if (rowData[r0--] == c0++) {
                return true;
            }
        }
        r0 = r;
        c0 = c;
        while (r0 < n && c0 >= 0) {
            if (rowData[r0++] == c0--) {
                return true;
            }
        }
        return false;
    }

    private void setResult() {
        List<String> group = new ArrayList<>();
        char[] data = new char[n];
        for (int r = 0; r < n; r++) {
            Arrays.fill(data, '.');
            data[rowData[r]] = 'Q';
            group.add(String.valueOf(data));
        }
        result.add(new ArrayList<>(group));
    }
}
