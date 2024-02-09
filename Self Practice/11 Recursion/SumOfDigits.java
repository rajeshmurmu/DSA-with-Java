public class SumOfDigits {

    public static int sumOfDigits(int num) {

        if (num >= 0 && num <= 9) {
            return num;
        }

        return num % 10 + sumOfDigits(num / 10);
    }

    public static void main(String[] args) {
        int num = 12345;

        System.out.println(sumOfDigits(num));
    }
}