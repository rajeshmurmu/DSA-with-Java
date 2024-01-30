
public class IsSorted {

    public static boolean isSorted(int arr[], int i) {

        // base case
        if (i == arr.length - 1) {
            return true;
        }

        // check first and second element;
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 6, 4 };
        int start = 0;

        System.out.println(isSorted(nums, start));
    }
}
