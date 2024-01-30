
public class RotateArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 11, 5, 8 };

        int last = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        arr[0] = last;

        // print after rotate
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
