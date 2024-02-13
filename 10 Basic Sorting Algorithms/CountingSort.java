
public class CountingSort {

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;

        // finding maximum element from the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // counting the element
        int count[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // updating on original array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] != 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

        // printing after sorting
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };

        countingSort(nums);
    }
}
