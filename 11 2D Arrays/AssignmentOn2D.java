
public class AssignmentOn2D {

    public static void countOfN(int arr[][]) {
        int countof7 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    countof7++;
                }
            }
        }

        System.out.println(countof7);
    }

    public static void sumOf2ndRow(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[1][i];
        }

        System.out.println(sum);
    }

    public static void transposeMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j != 0 || j != arr[0].length - 1) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }

        // printing matrix;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // question 1
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        countOfN(arr);

        // qustion 2
        // int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        // sumOf2ndRow(nums);

        // question 3
        // int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        // transposeMatrix(nums);

    }
}
