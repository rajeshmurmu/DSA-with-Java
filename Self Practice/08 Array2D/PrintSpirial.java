
public class PrintSpirial {

    public static void printSpirailMatrix(int matrix[][]) {
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;

        while (top <= bottom && left <= right) {
            for (int i = top; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }

            for (int i = top + 1; i <= bottom; i++) {
                if (top == bottom) {
                    break;
                }
                System.out.print(matrix[i][right] + " ");
            }

            for (int i = right - 1; i >= left; i--) {
                if (left == right) {
                    break;
                }
                System.out.print(matrix[bottom][i] + " ");
            }

            for (int i = bottom - 1; i > top; i--) {
                System.out.print(matrix[i][left] + " ");
            }

            top++;
            right--;
            bottom--;
            left++;

        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpirailMatrix(matrix);
    }
}
