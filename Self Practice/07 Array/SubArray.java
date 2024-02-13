
public class SubArray {

    public static void subArrays(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println("subarrays"+i);
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k]+" ");
                    sum += arr[k];

                }
                // System.out.println();
                if (sum > max)
                    max = sum;
            }

        }
        System.out.println(max);
    }

    public static void findSubArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ",");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // subArrays(arr);
        findSubArray(arr);
    }
}
