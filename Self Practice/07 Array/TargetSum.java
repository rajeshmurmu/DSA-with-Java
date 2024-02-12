public class TargetSum {

    public static void findPair(int arr[], int target) {
        int count = 0;

        // this code is for order of n square time complexity
        // for (int i = 0; i <= arr.length - 2; i++) {
        // for (int j = i + 1; j <= arr.length - 1; j++) {
        // if (arr[i] + arr[j] == target) {
        // count++;
        // }

        // }
        // }

        // code for another code of this problem
        int i = 0;
        int j = i + 1;
        while (i < arr.length - 1) {
            if (arr[i] + arr[j] == target) {
                count++;
                i++;
                j = i + 1;
            }

            if (j == arr.length - 1) {
                i++;
                j = i + 1;
            }
            j++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 3, 5, 8, 2 };
        int target = 7;

        findPair(arr, target);

    }
}
