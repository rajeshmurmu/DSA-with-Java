public class SearchInRotedArray {

    public static int searchInRotedArray(int arr[], int target, int si, int ei) {

        if (si > ei) {
            return -1;
        }

        // work
        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[ei]) {
                return searchInRotedArray(arr, target, si, mid - 1);
            } else {
                return searchInRotedArray(arr, target, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return searchInRotedArray(arr, target, mid + 1, ei);
            } else {
                return searchInRotedArray(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int res = searchInRotedArray(arr, target, 0, arr.length - 1);
        System.out.println(res);
    }
}
