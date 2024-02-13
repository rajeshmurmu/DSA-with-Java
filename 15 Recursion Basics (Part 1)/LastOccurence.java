
public class LastOccurence {

    public static int lastOccurence(int arr[], int i, int target) {
        if (i < 0) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        }

        return lastOccurence(arr, i - 1, target);

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 4, 3, 2, 6, 2, 6, 3 };
        int index = nums.length - 1;
        int key = 3;

        System.out.println(lastOccurence(nums, index, key));

    }
}
