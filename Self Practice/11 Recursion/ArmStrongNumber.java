public class ArmStrongNumber {
    // 0, 1, 153, 370, 371 and 407, 1634 are the armstrong Numbers.
    // 153 = (1*1*1)+(5*5*5)+(3*3*3)
    // where:
    // (1*1*1)=1
    // (5*5*5)=125
    // (3*3*3)=27
    // So:
    // 1+125+27=153

    // Here count the digit in the number
    public static int countDigit(int num, int count) {
        if (num / 10 == 0) {
            return count + 1;
        }

        return countDigit(num / 10, count + 1);
    }

    // Here multiply the number digits time
    public static int multiplyNTimes(int num, int n) {
        if (n == 0) {
            return 1;
        }

        return num * multiplyNTimes(num, n - 1);
    }

    // Here adding the all numbers multiplyNTimes
    public static int calulateAllDigits(int num) {
        int digit = countDigit(num, 0);
        // System.out.println(digit);
        // System.out.println(multiplyNTimes(num % 10, digit));

        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans += multiplyNTimes(rem, digit);

            num = num / 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        // int num = 407;
        int num = 1634;
        if (calulateAllDigits(num) == num) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " not an Armstrong Number");
        }

        // System.out.println(calulateAllDigits(num));
    }
}
