import java.util.Arrays;

public class BackTrackingOnArray {

    public static void changeArr(int[] arr, int i, int val) {
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2; // This is Backtracking
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        changeArr(arr, 0, 1);

        System.out.println(Arrays.toString(arr));
    }
}