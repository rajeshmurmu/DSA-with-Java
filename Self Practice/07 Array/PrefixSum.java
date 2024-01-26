// prefix sum of array
public class PrefixSum {

    public static void prefixSum(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int start = 1;
        while (start < arr.length) {
            prefix[start] = prefix[start - 1] + arr[start];
            start++;
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] > maxSum) {
                maxSum = prefix[i];
            }
        }

        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };

        prefixSum(numbers);
    }
}
