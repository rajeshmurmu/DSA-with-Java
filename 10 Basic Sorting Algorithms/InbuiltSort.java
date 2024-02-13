import java.util.*;

public class InbuiltSort {
    public static void main(String[] args) {
        Integer nums[] = { 5, 4, 1, 3, 2 };

        // time complexity = O(n logn) which is < O(n^2);
        // Arrays.sort(nums); // sorting whole array
        // Arrays.sort(nums, 0, 3); // sorting with given prams
        Arrays.sort(nums, Collections.reverseOrder()); // sorting in reverse form

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
