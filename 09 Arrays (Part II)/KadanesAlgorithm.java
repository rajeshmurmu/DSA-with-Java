public class KadanesAlgorithm {

    public static void kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum < 0) {

                sum = 0;
            }

            if (sum > maxSum) {

                maxSum = sum;
            }
        }

        System.out.println(maxSum);

    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        kadanes(numbers);
    }
}
