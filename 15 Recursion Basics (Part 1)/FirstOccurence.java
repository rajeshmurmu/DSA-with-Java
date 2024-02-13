
public class FirstOccurence {

    public static int firstOccurence(int arr[], int i, int target) {
        if (i == arr.length - 1) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        }

        return firstOccurence(arr, i + 1, target);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };
        int index = 0;
        int key = 10;

        System.out.println(firstOccurence(nums, index, key));

    }
}
