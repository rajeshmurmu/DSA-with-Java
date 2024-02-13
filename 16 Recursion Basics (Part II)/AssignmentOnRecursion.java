public class AssignmentOnRecursion {

    // problem I
    public static void findOccurrences(int arr[], int target, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            System.out.print(index + " ");
        }

        findOccurrences(arr, target, index + 1);
    }

    // problem II
    public static void convertToString(int num, String arr[]) {
        if (num / 10 == 0) {
            checkNumInArray(num, arr);
            return;
        }

        // check for last digit in the number should not zero
        // if (num % 10 == 0) {
        // System.out.println("last digit can not be zero 0");
        // return;
        // }

        convertToString(num / 10, arr);
        checkNumInArray(num, arr);

    }

    public static void checkNumInArray(int num, String arr[]) {
        int target = num % 10;
        for (int i = 0; i < arr.length; i++) {
            if (i == target) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // problem 3 solved with some doubt
    public static int lengthOfString(String str) {
        if (str.equals("")) {
            return 0;
        } else {

            return lengthOfString(str.substring(1)) + 1;
        }
    }

    public static void main(String[] args) {
        // problem 1;
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        // findOccurrences(arr, key, 0);

        // poblem 2
        int num = 202401;
        String nums[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        // convertToString(num, nums);

        // problem 3
        String str = "Rajeshson";
        System.out.println(lengthOfString(str));

    }
}
