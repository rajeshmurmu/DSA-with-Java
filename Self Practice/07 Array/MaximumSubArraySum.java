public class MaximumSubArraySum {

    public static int findMaxiSumSubArray(int arr[]) {
        int maxi = Integer.MIN_VALUE;

        for (int j = 0; j < arr.length; j++) {
            int prefix = 0;
            for (int i = j; i < arr.length; i++) {
                prefix += arr[i];
                maxi = Integer.max(maxi, prefix);
            }

        }

        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = { 4, -6, 2, 8 };

        int res = findMaxiSumSubArray(arr);
        System.out.println(res);
    }
}
