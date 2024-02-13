public class ArrayAssignment {

    public static boolean duplicateInArray(int arr[]) {

        // O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int search(int arr[], int target) {

        int start = 0, end = arr.length - 1;

        if (arr.length == 1) {
            if (target == arr[0]) {
                return 0;
            } else {
                return -1;
            }
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                if (arr[mid + 1] < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Question I
        // int nums[] = { 1, 2, 3, 4, 1 };
        // System.out.println(duplicateInArray(nums));

        // Question II
        // int nums[] = { 1 };
        // int target = 0;
        // System.out.println(search(nums, target));
    }
}
