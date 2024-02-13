import java.util.Arrays;

// Not Solved
public class Merge2SortedArray {

    public static void merge2SortedArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int i = 0, j = 0;

        while (i < n) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;

                sortRemain(arr2);
            }

            i++;
        }

    }

    public static void sortRemain(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
    }

    // public static void merge2SortedArray2(int[] arr1, int[] arr2) {
    // int a2 = 0;

    // while (a2 < arr2.length) {
    // for (int j = 0; j < arr1.length; j++) {
    // if (arr2[a2] < arr1[j]) {
    // int temp = arr1[j];
    // arr1[j] = arr2[a2];
    // arr2[a2] = temp;

    // }
    // }

    // a2++;
    // }
    // }

    public static void main(String[] args) {
        // int arr1[] = { 1, 3, 5, 7 };
        // int arr2[] = { 0, 2, 6, 8, 9 };
        int arr1[] = { 1, 2, 2, 3, 5, 6 };
        int arr2[] = { 2, 5, 6 };
        merge2SortedArray(arr1, arr2);
        // merge2SortedArray2(arr1, arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}