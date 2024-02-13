public class PowerN {

    public static int Pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // return x * Pow(x, n - 1);

        // Optimized Code
        int halfPower = Pow(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;

    }

    public static void main(String[] args) {

        int x = 2;
        int n = 5;
        System.out.println(Pow(x, n));
    }
}
