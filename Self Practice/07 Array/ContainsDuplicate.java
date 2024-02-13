public class ContainsDuplicate {

    public static boolean containsDuplicate(int nums[]) {
        int temp[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i] - 1]++;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= 2) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 3 };
        boolean res = containsDuplicate(arr);
        System.out.println(res);
    }
}
