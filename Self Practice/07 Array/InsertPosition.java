import java.util.Arrays;

public class InsertPosition {

    public static void findInsertPositon(int arr[], int elem) {
        int start = 0;
        int end = arr.length - 1;

        int res = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == elem) {
                res = mid;
                break;
            } else if (arr[mid] < elem) {
                start = mid + 1;

            } else {
                res = mid;
                end = mid - 1;
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 10, 12, 19, 34, 40, 45, 50, 70, 75, 77, 79, 83, 87, 90, 92, 95 };
        Arrays.sort(arr);

        findInsertPositon(arr, 70);
    }

}
