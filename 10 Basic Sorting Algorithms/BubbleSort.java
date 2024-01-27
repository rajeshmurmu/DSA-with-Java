public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false)
                break;
        }

        // printing sorted elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        // int nums[] = { 5, 3, 6, 2, 4 };

        bubbleSort(nums);
    }
}
