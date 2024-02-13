public class GridWays {
    static int count = 0;

    public static void gridWays2(int n, int m, int rowIndex, int colIndex) {

        // base case;
        if (rowIndex == n && colIndex == m) {
            count++;
            return;
        }

        // recursion
        if (rowIndex == n) {
            gridWays2(n, m, rowIndex, colIndex + 1);

        }

        if (colIndex == m) {
            gridWays2(n, m, rowIndex + 1, colIndex);
        }

        if (rowIndex < n && colIndex < m) {

            gridWays2(n, m, rowIndex + 1, colIndex);
            gridWays2(n, m, rowIndex, colIndex + 1);
        }

    }

    // Big O (2^n+m)

    public static int gridWays(int rowIndex, int colindex, int n, int m) {
        if (rowIndex == n - 1 && colindex == m - 1) {
            return 1;
        } else if (rowIndex == n || colindex == m) {
            return 0;
        }

        int way1 = gridWays(rowIndex + 1, colindex, n, m);
        int way2 = gridWays(rowIndex, colindex + 1, n, m);

        return way1 + way2;
    }

    public static void main(String[] args) {
        int n = 5, m = 2;
        System.out.println(gridWays(0, 0, n, m));

        // gridWays2(n, m, 1, 1);
    }
}
