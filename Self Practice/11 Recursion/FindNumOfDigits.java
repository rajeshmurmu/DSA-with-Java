public class FindNumOfDigits {

    public static int findNumOfDigits(int num, int ans) {
        if (num >= 0 && num <= 9) {
            return ans + 1;
        }
        return findNumOfDigits(num / 10, ans + 1);
    }

    public static void main(String[] args) {
        int num = 12345;

        System.out.println(findNumOfDigits(num, 0));
    }
}
