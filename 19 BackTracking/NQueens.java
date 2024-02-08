
public class NQueens {

    static int count = 0;

    public static boolean isSafe(char board[][], int row, int col) {

        // vertical up

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag right up

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char[][] board, int row) {

        if (row == board.length) {
            // printBoard(board);
            count++;
            // System.out.println(Arrays.toString(board[0]));
            // System.out.println(Arrays.toString(board[1]));
            return;
        }

        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'X';
            }
        }
    }

    public static void printBoard(char arr[][]) {

        System.out.println("----------- Board ------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;

        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
        System.out.print("Total ways to solve n Queens = ");
        System.out.println(count);

        // System.out.println(Arrays.toString(board[0]));
        // System.out.println(Arrays.toString(board[1]));
    }
}
