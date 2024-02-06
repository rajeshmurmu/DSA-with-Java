public class BinarySearchIn2D {

    public static void binarySearchIn2D(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length) {
            if (arr[row][0] <= target && target <= arr[row][col]) {
                // System.out.println(row + " " + col);

                int scol = 0;
                int ecol = arr[0].length - 1;

                while (scol <= ecol) {
                    int mid = scol + (ecol - scol) / 2;
                    if (arr[row][mid] == target) {
                        System.out
                                .println("The index is : " + row + " " + mid + " Target element is : " + arr[row][mid]);
                        return;

                    } else if (arr[row][mid] > target) {
                        ecol = mid - 1;
                    } else {
                        scol = mid + 1;

                    }
                }

                return;
            } else {
                row++;
            }
        }

        System.out.println(-1 + " Not found the targeted element");
    }

    public static void linearSearchIn2D(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("(" + i + "," + j + ")");
                    return;
                }
            }
        }
    }

    public static boolean binarySearchIn2D2(int arr[][], int target) {
        int start = 0;
        int end = arr.length * arr[0].length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid / arr[0].length][mid % arr[0].length] == target) {
                return true;
            } else if (arr[mid / arr[0].length][mid % arr[0].length] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    public static boolean linearSearchIn2D2(int arr[][], int target) {

        int start = 0, end = arr[0].length - 1;

        while (start < arr.length && end >= 0) {
            if (arr[start][end] == target) {
                return true;
            } else if (arr[start][end] > target) {
                end--;
            } else {
                start++;
            }
        }

        return false;

    }

    public static void main(String args[]) {
        // int arr[][] = {
        // { 2, 6, 10, 14, 18 },
        // { 20, 24, 27, 29, 38 },
        // { 47, 52, 78, 93, 102 },
        // { 108, 111, 200, 218, 320 }
        // };

        int arr[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        // linearSearchIn2D(arr, 52);
        System.out.println(linearSearchIn2D2(arr, 601));
        // binarySearchIn2D(arr, 30);
        // System.out.println(binarySearchIn2D2(arr, 50));

        // finding rows size and col size;
        // int row = arr.length;
        // int col = arr[0].length;
        // System.out.println(row + " " + col);
    }
}