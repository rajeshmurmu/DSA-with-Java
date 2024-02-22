public class SetMatrixZeros {

    public static void setZeros(int[][] matrix) {
        boolean col[] = new boolean[matrix[0].length];
        boolean row[] = new boolean[matrix.length];

        // checking rows and col
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // push zero to array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == true || col[j] == true) {
                    matrix[i][j] = 0;
                }
            }
        }

        // print
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        setZeros(matrix);
    }
}