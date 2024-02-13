
public class SelectionSort {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallElem = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallElem] > arr[j]) {
                    smallElem = j;
                }
            }

            // swap
            int temp = arr[smallElem];
            arr[smallElem] = arr[i];
            arr[i] = temp;

        }

        // printing sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };

        selectionSort(nums);
    }
}
