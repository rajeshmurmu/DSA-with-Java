public class BinarySearchIn2D {

    public static void binarySearch(int arr[][], int target) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row <= arr.length - 1 && col >= 0) {
            if (arr[row][col] == target) {
                System.out.println("found key at (" + row + "," + col + ")");
                return;
            } else if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("not found");
    }

    public static void main(String[] args) {
        int nums[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        binarySearch(nums, 50);
    }

}
