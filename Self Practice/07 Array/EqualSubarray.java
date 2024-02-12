public class EqualSubarray {

    public static boolean equalSubarray(int arr[]) {

        int prefix = 0;
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            prefix += arr[i];

            if (totalsum - prefix == prefix) {
                // System.out.println(prefix);
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 4, -2, 5, 8, 20, -10, 8 };

        boolean ans = equalSubarray(arr);
        System.out.println(ans);

    }
}
