import java.util.Arrays;

public class SearchDuplicateInArray {

    public static void findDuplicate(int[] arr) {
        int temp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (temp[arr[i]] == 1) {
                System.out.println(arr[i]);
                // break;
            }
            temp[arr[i]] = 1;
        }

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 8, 7, 6, 5, 4, 3, 9, 4, 2 };

        findDuplicate(arr);
    }
}
